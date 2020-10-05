package com.lcc.main;

import com.lcc.controller.DynQuery;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        DynQuery dynQuery = (DynQuery) context.getBean("dynQuery");
        dynQuery.test();
    }
}
