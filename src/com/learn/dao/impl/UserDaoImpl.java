package com.learn.dao.impl;

import com.learn.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/9 9:11<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@SuppressWarnings("all")
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money-? where username = ?";
        jdbcTemplate.update(sql,100,"李佳乐");
    }

    @Override
    public void addMoney() {
        String sql = "update t_account set money=money+? where username = ?";
        jdbcTemplate.update(sql,100,"赵坤");

    }
}
