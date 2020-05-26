package com.example.demo.myaspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelloAspect {
    //@Pointcut(value = "within(com.example.demo.service.DemoService)")
    @Pointcut(value = "within(com.example.demo.controller.TestAop)")
    public void point(){

    }

    @After("point()")
    public void afterHello(JoinPoint joinPoint){
        System.out.println("一个增强实验");
    }

}
