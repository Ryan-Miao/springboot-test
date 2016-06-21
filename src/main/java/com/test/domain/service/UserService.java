package com.test.domain.service;

import com.test.domain.entity.User;
import com.test.domain.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by miaorf on 2016/6/19.
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.getUsers();
    }

    public User addUser(User user){
        return userRepository.addUser(user);
    }

    public boolean delete(int id) {
        return userRepository.delete(id);
    }
}
