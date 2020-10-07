package com.lcc.controller;

import com.lcc.pojo.User;
import com.lcc.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    private static final Log logger = LogFactory.getLog(UserController.class);
    @Autowired
    public UserService userService;

    // 处理登录
    @RequestMapping("/login")
    public String login(User user, HttpSession httpSession, Model model) {
        if (userService.login(user)) {
            httpSession.setAttribute("u", user);
            logger.info("成功");
            // 跳转到 main.jsp (匹配servel设置中的前缀和后缀)
            return "main";
        }else {
            model.addAttribute("messageError","用户名或密码错误");
            return "login";
        }
    }

    // 处理注册
    @RequestMapping("/register")
    public String register(User user, Model model) {
        if (userService.register(user)) {
            logger.info("注册成功");
            return "login";
        }else {
            logger.info("注册失败");
            model.addAttribute("user",user.getUser());
            return "register";
        }
    }
}
