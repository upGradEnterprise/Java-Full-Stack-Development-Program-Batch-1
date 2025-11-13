package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080

@RestController
@RequestMapping("public")
public class SimpleController {

    @GetMapping(value = "")
    public String sayHello() {
        return "Welcome to Simple Spring boot security example - public access";
    }
}
