package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping(value = "hello")
    public String sayHello() throws Exception{
        System.out.println("Rest Controller method execution start");
            Thread.sleep(4000);
        System.out.println("Rest Controller method execution end");
        return "Welcome to Spring boot Rest API with AOP concept";
    }

    @GetMapping(value = "exception/{value}")
    public String generateException(@PathVariable() int value) throws Exception{
        int result = 100/value;
        return "Result is "+result;
    }
}
