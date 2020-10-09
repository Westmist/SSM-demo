package com.lcc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取请求的url
        String url = request.getRequestURI();
        // 登录页面或登录请求，放行
        if (url.indexOf("/toLogin") >= 0 || url.indexOf("/login") >= 0) {
            return true;
        }
        // 获取session
        HttpSession session = request.getSession();
        Object obj = session.getAttribute("user");
        if (obj != null){
            return true;
        }
        request.setAttribute("msg","你还没有登录，请先登录");
        // 转发到登录页面
        request.getRequestDispatcher("/pages/login.jsp").forward(request,response);
        return false;
    }
}