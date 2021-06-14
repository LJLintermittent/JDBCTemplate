package com.learn.test;

import com.learn.config.TransactionConfig;
import com.learn.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/9 9:19<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@SuppressWarnings("all")
public class TestTransaction {
    @Test
    public void testAccount(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("JDBCTemplate.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();

    }
    @Test
    public void testAccountByXml(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Transaction.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();

    }
    @Test
    public void testAccountByConfigClass(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TransactionConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();

    }
}
