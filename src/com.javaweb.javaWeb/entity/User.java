package com.javaweb.javaWeb.entity;

public class User {
    private int id;
    private String username;
    private String password;
    private String sex;
    private String email;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pwd) {password = pwd; }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

}