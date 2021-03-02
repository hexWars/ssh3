package com.example.domain;

import lombok.Data;

/**
 * @Description
 * @Author Cai
 * @Date 2021-02-26 17:04
 */
@Data
public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }
}



