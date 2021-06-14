package com.learn.test;

import com.learn.entity.Book;
import com.learn.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/8 13:31<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@SuppressWarnings("all")
public class TestDemo {
    @Test
    public void testDemo(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("JDBCTemplate.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("4");
        book.setUsername("李佳乐");
        book.setUstutas("ok");
        bookService.addBook(book);

//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("javaEE");
//        book.setUstutas("A");
//        bookService.updateBook(book);

//        bookService.deleteBook("4");

//        int count = bookService.findCount();
//        System.out.println(count);

//        Book book = bookService.findObject("1");
//        System.out.println(book);

//        List<Book> all = bookService.findAll();
//        System.out.println(all);

//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"5","c#","E"};
//        Object[] o2 = {"6","golang","F"};
//        Object[] o3 = {"7","rust","g"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchAdd(batchArgs);

//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"c#555","E5","5"};
//        Object[] o2 = {"golang666","F6","6"};
//        Object[] o3 = {"rust777","g7","7"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchUpdate(batchArgs);

//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o3 = {"7"};
//        batchArgs.add(o3);
//        bookService.batchDelete(batchArgs);
    }
}
