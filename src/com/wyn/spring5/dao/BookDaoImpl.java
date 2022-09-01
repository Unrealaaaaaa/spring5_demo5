package com.wyn.spring5.dao;

import com.wyn.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author Unreal
 * @date 2021/12/8 - 21:24
 */
@Repository
public class BookDaoImpl implements BookDao{

    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //增加
    @Override
    public void add(Book book){
        //创建sql语句
        String sql = "insert into t_book values(?,?,?)";
        //调用方法实现
        int update = jdbcTemplate.update(sql, book.getBookId(),book.getBookname(),book.getBookstatus());
        System.out.println(update);
    }

    //修改
    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set bookname = ?,bookstatus = ? where bookId = ?";
        int update = jdbcTemplate.update(sql, book.getBookname(),book.getBookstatus(),book.getBookId());
        System.out.println(update);
    }

    //删除
    @Override
    public void delete(String id) {
        String sql = "delete from t_book where bookId = ?";
        int update = jdbcTemplate.update(sql,id);
        System.out.println(update);
    }

    //查询表记录数
    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    //查询返回对象
    @Override
    public Book findBook(String id) {
        String sql = "select * from t_book where bookId = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    //查询返回集合
    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    //批量添加数据
    @Override
    public void batchAllBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        int[] batchUpdate = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(batchUpdate));
    }

}
