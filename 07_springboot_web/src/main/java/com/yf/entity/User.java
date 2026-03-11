package com.yf.entity;

/**
 * @author 杨非
 * @date 2026年03月11日 10:00
 */
public class User {
    private Integer id;
    private String username;
    private String address;

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

    public User() {
    }

    public User(Integer id,String username, String address) {
        this.username = username;
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username='" + username + '\'' + ", address='" + address + '\'' + '}';
    }
}
