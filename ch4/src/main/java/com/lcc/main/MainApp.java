package com.lcc.main;

import com.lcc.controller.ServerController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ServerController serverController = (ServerController) context.getBean("serverController");
        serverController.test();
    }
}
