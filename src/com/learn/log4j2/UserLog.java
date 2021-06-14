package com.learn.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/9 11:00<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class UserLog {
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }
}
