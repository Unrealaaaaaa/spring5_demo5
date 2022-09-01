package com.wyn.spring5.dao;

import com.wyn.spring5.entity.Book;

import java.util.List;

/**
 * @author Unreal
 * @date 2021/12/8 - 21:23
 */
public interface BookDao {

    //添加的方法
    void add(Book book);

    void updateBook(Book book);

    void delete(String id);

    int selectCount();

    Book findBook(String id);

    List<Book> findAllBook();

    void batchAllBook(List<Object[]> batchArgs);
}
