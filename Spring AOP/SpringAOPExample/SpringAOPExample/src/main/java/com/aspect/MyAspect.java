package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

//    @Before("execution(* com.controller.HelloController.sayHello(..))")
//    public void beforeAdvice() {
//        System.out.println("before advice");
//    }
//
//    @After("execution(* com.controller.HelloController.sayHello(..))")
//    public void afterAdvice() {
//        System.out.println("after advice");
//    }

    @Around("execution(* com.controller.HelloController.sayHello(..))")
    public Object aroundAdvice(ProceedingJoinPoint pp) throws Throwable {
        System.out.println("before advice");
        long start = System.currentTimeMillis();
                Object obj = pp.proceed();
        long end = System.currentTimeMillis();
        System.out.println("After Advice");
        System.out.println(pp.getSignature().getName()+" took "+(start-end)+"ms");
        return obj;
    }

    @AfterThrowing("execution(* com.controller.HelloController.generateException(..))")
    public void exceptionGenerateAdvice() {
        System.out.println("it execute if any exception generate");
    }

}
