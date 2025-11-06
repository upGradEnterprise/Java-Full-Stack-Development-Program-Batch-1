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

    // http://localhost:8080/aboutusPage
    @RequestMapping(value = "/aboutusPage",method = RequestMethod.GET)
    public String AboutUs() {
        System.out.println("About Us Page Open");
        return "aboutus"; // using view resolved it open specific page part template folder.
    }
    // http://localhost:8080/contactusPage
    @RequestMapping(value = "/contactusPage",method = RequestMethod.GET)
    public String contactUs() {
        System.out.println("Contact us Page open");
        return "contactus"; // using view resolved it open specific page part template folder.
        //return "home";    // it search home.html page inside template folder.
    }
    // http://localhost:8080/loginPage
    @RequestMapping(value = "/loginPage",method = RequestMethod.GET)
    public String loginPage() {
        System.out.println("login page open");
        return "login"; // using view resolved it open specific page part template folder.

    }


}
