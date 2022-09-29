package com.Text.bean;

public class User {
    private int user;
    private String password;
    private String name;
    public User(){}

    public User(int user, String password, String name) {
        this.name = name;
        this.user = user;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "user=" + user +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
