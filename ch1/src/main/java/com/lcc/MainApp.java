package com.lcc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;

/*
 * 初识Spring IOC
 * 使用IOC的两种方式(XML配置以及注解形式)
 */

public class MainApp {
    public static void main(String[] args) {
        /*                     基于XML配置的AOP                          */
        // 装载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // 由Spring 的 IOC 容器去创建Bean类并管理其生命周期
        Student student = (Student) context.getBean("student");
        // 打印XML配置文件中为Bean类实例设置的属性值
        System.out.println("姓名："+student.getName());
        System.out.println("年龄："+student.getAge());
        // 更改age属性值
        student.setAge(19);
        // 打印更改后的age
        System.out.println("爆竹声中一岁除："+student.getAge());
        // 获取List类属性
        Iterator<String> iterator = student.getInterest().iterator();
        System.out.print("爱好：");
        // 迭代器遍历
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"   ");
        }
        System.out.println("\n"+"——————基于注解的自动装配AOP——————");   //换行

        /*                   基于注解的自动装配AOP                           */
        // Bean类的ID为注释'@Component()'的参数
        Player player = (Player) context.getBean("player");
        System.out.println("玩家："+player.getID());
        System.out.println("等级："+player.getLevel());
        // 更改Level属性值
        player.setLevel(100);
        // 打印更改后的值
        System.out.println("升级："+player.getLevel());
    }
}
