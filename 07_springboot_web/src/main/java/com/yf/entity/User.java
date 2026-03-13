package com.yf.entity;


import java.util.Date;

/**
 * @author 杨非
 * @date 2026年03月11日 10:00
 */

public class User {
    private Integer id;
    private String username;
    private String address;
    private Date birthday;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User() {
    }

    public User(Integer id,String username, String address) {
        this.username = username;
        this.id = id;
        this.address = address;
    }

    public User(Integer id, String username, String address, Date birthday) {
        this.id = id;
        this.username = username;
        this.address = address;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" + "address='" + address + '\'' + ", id=" + id + ", username='" + username + '\'' + ", birthday=" + birthday + '}';
    }
}
