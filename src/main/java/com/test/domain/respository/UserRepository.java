package com.test.domain.respository;

import com.test.domain.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miaorf on 2016/6/19.
 */
@Repository
public class UserRepository {
    private static List<User> users = new ArrayList<User>();

    static {
        users.add(new User("Ryan","123456", 18,"1991-02-23","man"));
        users.add(new User("Leslie","password", 18,"1993-02-23","woman"));
        users.add(new User("XiaoMing","bugaosuni", 8,"1891-12-03","man"));
        users.add(new User("Tom","chiru", 28,"1981-02-23","man"));
    }

    public List<User> getUsers(){
        return users;
    }
}
