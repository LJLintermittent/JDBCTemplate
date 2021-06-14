package com.learn.entity;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/8 11:13<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class Book {
    private String userId;
    private String username;
    private String ustutas;

    @Override
    public String toString() {
        return "Book{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", ustutas='" + ustutas + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstutas() {
        return ustutas;
    }

    public void setUstutas(String ustutas) {
        this.ustutas = ustutas;
    }
}
