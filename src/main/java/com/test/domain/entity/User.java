package com.test.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by miaorf on 2016/6/19.
 */
public class User implements Serializable{
    private String username;
    private String password;
    private int age;
    private String birth;
    private String sex;


    public User(String username, String password, int age, String birth, String sex) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.birth = birth;
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getBirth() {
        return birth;
    }

    public String getSex() {
        return sex;
    }
}
