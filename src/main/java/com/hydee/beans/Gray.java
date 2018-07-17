package com.hydee.beans;

/**
 * @author zwg
 * @date 2018/7/17 0017 22:04
 */
public class Gray {
    String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Gray{" +
                "username='" + username + '\'' +
                '}';
    }
}
