package com.example.demo.component;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CxxAop {

    //设置切点
    @Pointcut(value = "execution(* com.example.demo..*.run(..))")
    public void aop(){
    }

    @Before("aop()")
    public void before(){
        System.out.println("before：执行方法前");
    }


    @After("aop()")
    public void after(){
        System.out.println("after：执行方法后");
    }


    @AfterThrowing("aop()")
    public void afterThrowing(){
        System.out.println("afterThrowing：异常抛出后");
    }

    @AfterReturning("aop()")
    public void afterReturning(){
        System.out.println("afterReturning：方法返回后");
    }

    @Around("aop()")
    public void around(ProceedingJoinPoint joinPoint){

        System.out.println("around：环绕通知前");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around：环绕通知后");

    }

}
