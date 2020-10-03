package com.lcc.controller;

import com.lcc.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ServerController {
    @Autowired
    private ActionService actionService;
    // 调用Server层

    public void test(){
        actionService.action();
    }
}
