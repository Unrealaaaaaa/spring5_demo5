package com.wyn.spring5.entity;

/**
 * @author Unreal
 * @date 2021/12/8 - 21:35
 */
public class Book {

    private int bookId;
    private String bookname;
    private String bookstatus;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookname='" + bookname + '\'' +
                ", bookstatus='" + bookstatus + '\'' +
                '}';
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookstatus() {
        return bookstatus;
    }

    public void setBookstatus(String bookstatus) {
        this.bookstatus = bookstatus;
    }
}
