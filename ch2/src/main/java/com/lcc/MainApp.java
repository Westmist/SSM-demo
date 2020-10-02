package com.lcc;

import com.lcc.annotation.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        People people = (People) context.getBean("people");
        people.say();
        System.out.println("——————异常通知测试——————");
//        people.except();

        System.out.println("——————基于注解的AOP——————");
        Student student = (Student) context.getBean("student");
        student.study();
        System.out.println("——————基于注解的异常通知测试——————");
//        student.stupid();
    }
}
