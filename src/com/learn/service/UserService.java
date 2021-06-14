package com.learn.service;

import com.learn.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/9 9:10<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,timeout = -1,readOnly = false)
public class UserService {
    @Autowired
    private UserDao userDao;
    public void accountMoney(){
        userDao.reduceMoney();
//        int i = 10/0;
        userDao.addMoney();
    }


}
