package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    // http://localhost:8080

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String openFirstPage() {
        System.out.println("if you need any initialization before first page open");
    System.out.println("I Came Here");
        return "index"; // using view resolved it open specific page part template folder.
        //return "home";    // it search home.html page inside template folder.
    }

}
