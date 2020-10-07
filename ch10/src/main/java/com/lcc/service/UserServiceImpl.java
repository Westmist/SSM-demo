package com.lcc.service;

import com.lcc.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public Boolean login(User user) {
        if ("mingxuan".equals(user.getUser()) && "1024".equals(user.getPassword()))
            return true;
        return false;
    }

    @Override
    public Boolean register(User user) {
        if ("mingxuan".equals(user.getUser()) && "1024".equals(user.getPassword()))
            return true;
        return false;
    }
}
