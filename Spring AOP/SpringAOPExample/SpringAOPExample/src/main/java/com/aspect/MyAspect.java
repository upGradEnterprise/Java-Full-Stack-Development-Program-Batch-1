package com.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Before("execution(* com.controller.HelloController.sayHello(..))")
    public void beforeAdvice() {
        System.out.println("before advice");
    }

    @After("execution(* com.controller.HelloController.sayHello(..))")
    public void afterAdvice() {
        System.out.println("after advice");
    }
}
