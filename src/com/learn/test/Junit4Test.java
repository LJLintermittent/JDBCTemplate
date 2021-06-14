package com.learn.test;

import com.learn.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/9 21:00<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:JDBCTemplate.xml")
public class Junit4Test {
    @Autowired
    private UserService userService;
    @Test
    public void test1(){
        userService.accountMoney();
    }
}
