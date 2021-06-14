package com.learn.service;

import com.learn.dao.BookDao;
import com.learn.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/8 13:27<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;

    public void addBook(Book book){
        bookDao.add(book);
    }
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }
    public void deleteBook(String id){
        bookDao.delete(id);
    }
    public int findCount(){
        return bookDao.selectCount();
    }
    public Book findObject(String id){
        return  bookDao.findBookInfo(id);
    }
    public List<Book> findAll(){
        return bookDao.findAllBook();
    }
    public void batchAdd(List<Object[]> batchArgs){
         bookDao.batchAddBook(batchArgs);
    }
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }
    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDeleteBook(batchArgs);
    }

}
