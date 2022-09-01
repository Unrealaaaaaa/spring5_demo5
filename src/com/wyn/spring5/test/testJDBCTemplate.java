package com.wyn.spring5.test;

import com.wyn.spring5.entity.Book;
import com.wyn.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Unreal
 * @date 2021/12/8 - 22:01
 */
public class testJDBCTemplate {

    @Test
    public void Test_01(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService",BookService.class);

        //增加
        /*Book book = new Book();
        book.setBookId(1);
        book.setBookname("好的好的");
        book.setBookstatus("hao");
        bookService.AddBook(book);*/

        //修改
        /*Book book = new Book();
        book.setBookId(1);
        book.setBookname("阿弥陀佛么么哒");
        book.setBookstatus("大冰");
        bookService.updateBook(book);*/

        //删除
        /*bookService.delete("1");*/

        //查询表记录条数
        /*int count = bookService.findCount();
        System.out.println(count);*/

        //查询返回对象
        /*Book book = bookService.findone("1");
        System.out.println(book);*/

        //查询返回集合
        /*List<Book> bookList = bookService.findAll();
        System.out.println(bookList);*/

        //批量添加
        /*List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3","你坏","大冰"};
        Object[] o2 = {"4","我不","大冰"};
        Object[] o3 = {"5","好吗好的","大冰"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAdd(batchArgs);*/
    }
}
