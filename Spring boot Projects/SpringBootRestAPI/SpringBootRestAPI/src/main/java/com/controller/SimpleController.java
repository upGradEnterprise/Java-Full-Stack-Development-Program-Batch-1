package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

    @RequestMapping(value = "say",method = RequestMethod.GET)
    public @ResponseBody String sayHello() {
        return "Welcome to Simple Rest API";
    }
}
