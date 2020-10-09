package com.lcc.controller;

import com.lcc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

@Controller
public class InterceptorController {
    // 登录页面初始化
    @RequestMapping("toLogin")
    public String initLogin() {
        return "login";
    }
    // 处理登录功能
    @RequestMapping("/login")
    public String login(User user, Model model, HttpSession session){
        System.out.println(user.getName());
        if ("明轩".equals(user.getName()) && "1024".equals(user.getPassword())){
            session.setAttribute("user",user);
            return "redirect:main";
        }
        model.addAttribute("msg","用户名或密码错误");
        return "login";
    }
    // 跳转到主页面
    @RequestMapping("/main")
    public String toMain(){
        return "main";
    }

    // 退出登录
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        // 清除session
        session.invalidate();
        // 跳转到登录界面
        return "login";
    }
}