package com.test.controller;

import com.test.domain.entity.User;
import com.test.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by miaorf on 2016/6/19.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/userList")
    public List<User> list(){
        return userService.getUsers();
    }
}
