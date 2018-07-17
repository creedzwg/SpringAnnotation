package com.hydee.beans;

/**
 * @author zwg
 * @date 2018/7/9 0009 19:02
 */

public class Person {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Person() {
        System.out.println("Person的初始化");
    }
}
