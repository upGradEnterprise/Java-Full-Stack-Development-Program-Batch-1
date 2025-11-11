package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("second")
public class SecondController {
    @GetMapping(value = "say")
    public String sayHello() {
        return "Welcome to Spring second micro service project";
    }
}
