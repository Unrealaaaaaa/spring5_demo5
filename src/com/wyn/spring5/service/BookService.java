package com.wyn.spring5.service;

import com.wyn.spring5.dao.BookDao;
import com.wyn.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Unreal
 * @date 2021/12/8 - 21:24
 */
@Service
public class BookService {

    //注入Dao
    @Autowired
    private BookDao bookDao;

    //增
    public void AddBook(Book book){
        bookDao.add(book);
    }

    //改
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    //删
    public void delete(String id){
        bookDao.delete(id);
    }

    //查询表记录数
    public int findCount(){
        return bookDao.selectCount();
    }

    //查询返回对象
    public Book findone(String id){
        return bookDao.findBook(id);
    }

    //查询返回集合
    public List<Book> findAll(){
        return bookDao.findAllBook();
    }

    //批量添加
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAllBook(batchArgs);
    }
}
