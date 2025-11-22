package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("producer")
public class ProducerController {


    @GetMapping(value = "service")
    public String sayHello() {
        return "Welcome to Produce service running on port number 8181";
    }
}
