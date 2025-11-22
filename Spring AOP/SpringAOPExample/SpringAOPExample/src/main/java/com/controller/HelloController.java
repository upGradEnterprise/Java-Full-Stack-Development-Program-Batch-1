package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping(value = "hello")
    public String sayHello() {
        System.out.println("Rest Controller method execution");
        return "Welcome to Spring boot Rest API with AOP concept";
    }
}
