package com.test.web.controller;

import com.test.domain.entity.ResponseStatus;
import com.test.domain.entity.RestResponse;
import com.test.domain.entity.User;
import com.test.domain.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping("/userList")
    public List<User> list(){
        return userService.getUsers();
    }

    @RequestMapping("addUser" )
    public RestResponse add(User user){
        RestResponse<User> restResponse = new RestResponse<>();
        try {
            user = userService.addUser(user);
            restResponse.setData(user).setStatus(ResponseStatus.Ok);
        } catch (Exception e) {
            String msg = "add user failed";
            restResponse.setMsg(msg).setStatus(ResponseStatus.Error);
            logger.error(msg,e);
        }
        return restResponse;
    }

    @RequestMapping("deleteUser")
    public RestResponse delete(int id){
        RestResponse<String> restResponse = new RestResponse();
        boolean flag;
        try {
            userService.delete(id);
            restResponse.setData("").setStatus(ResponseStatus.Ok);
        } catch (Exception e) {
            String msg = "delete user failed";
            restResponse.setMsg(msg).setStatus(ResponseStatus.Error);
            logger.error(msg,e);
        }
        return restResponse;
    }


}
