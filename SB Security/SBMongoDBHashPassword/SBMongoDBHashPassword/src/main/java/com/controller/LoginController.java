package com.controller;

import com.document.Login;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class LoginController {
    @GetMapping(value = "")
    public String greeting() {
        return "Welcome to spring boot with security";
    }

    @Autowired
    LoginService loginService;

    @PostMapping(value = "signIn",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String signIn(@RequestBody Login login){
        return loginService.signIn(login);
    }

    @PostMapping(value = "signUp",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String signUp(@RequestBody Login login){
        return loginService.signUp(login);
    }
}
