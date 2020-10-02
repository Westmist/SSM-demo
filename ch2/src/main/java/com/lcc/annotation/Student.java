package com.lcc.annotation;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
    public void study() {
        System.out.println("Stay Hunger!");
    }
    public void stupid() {
        int a = 100 / 0;
    }
}
