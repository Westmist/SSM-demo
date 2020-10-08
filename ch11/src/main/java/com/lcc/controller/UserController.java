package com.lcc.controller;

import com.lcc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class UserController {
    // 接收JSON数据并返回JSON数据
    @RequestMapping("/testJson")
    //该注解返回User类
    @ResponseBody
    public User testJSON(@RequestBody User user){
        System.out.println("name:"+user.getName()+",password:"+user.getPassword()+",age:"+user.getAge());
        return user;
    }
}
