package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping(value = "/")
    public String sayHello() {
        return "Welcome to Simple Spring boot security example - user access";
    }
}
