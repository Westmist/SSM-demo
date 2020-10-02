package com.lcc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("people")
public class People {
    @Value("Hello Spring Framework!")
    private String message;
    public void setMessage(){
        this.message = message;
    }
    public String say(){
        System.out.println(message);
        return message;
    }
    public void except(){
        int a = 10 / 0;
    }
}
