package com.lcc.service;

import com.lcc.pojo.User;

// 用户输入判断接口
public interface UserService {
    Boolean login(User user);
    Boolean register(User user);
}
