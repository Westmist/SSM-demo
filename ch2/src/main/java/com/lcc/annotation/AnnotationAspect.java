package com.lcc.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

// 定义切面
@Aspect
// 定义切面Bean，相当于 "<bean id="myAspect" class="com.lcc.MyAspect"/>"
@Component
public class AnnotationAspect {
    // 定义切入点，匹配Student中的所有方法
    @Pointcut("execution(* com.lcc.annotation.Student.*(..))")
    private void annotationAspect(){   // 方法名相当于切入点ID

    }
    @Before("annotationAspect()")
    public void beforeMethod(JoinPoint jp){
        System.out.println("基于注解的前置通知，目标类对象："+jp.getTarget());
    }
    @AfterThrowing(value = "annotationAspect()",throwing = "e")
    public void exception(Throwable e){
        System.out.println("基于注解的异常通知:"+e.getMessage());
    }
    @AfterReturning("annotationAspect()")
    public void returnMethod(){
        System.out.println("基于注解的后置返回通知");
    }
    @After("annotationAspect()")
    public void afterMethod(JoinPoint jp){
        System.out.println("基于注解的后置通知，被增强处理的方法："+jp.getSignature().getName());
    }
}
