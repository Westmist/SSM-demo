package com.lcc;

// 切面处理类
public class MyAspect {
    public void beforeMethod(){
        System.out.println("前置通知");
    }
    public void exceptionMethod(Throwable e){
        System.out.println("异常通知："+ e);
    }
    public void returnMethod(){
        System.out.println("后置返回通知");
    }
    public void afterMethod() {
        System.out.println("后置通知");
    }
}
