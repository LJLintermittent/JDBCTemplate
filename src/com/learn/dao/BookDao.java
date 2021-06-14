package com.learn.dao;

import com.learn.entity.Book;

import java.util.List;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/8 13:28<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public interface BookDao {
    void updateBook(Book book);

    void delete(String id);

    void add(Book book);

    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBook();

    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdateBook(List<Object[]> batchArgs);

    void batchDeleteBook(List<Object[]> batchArgs);
}

