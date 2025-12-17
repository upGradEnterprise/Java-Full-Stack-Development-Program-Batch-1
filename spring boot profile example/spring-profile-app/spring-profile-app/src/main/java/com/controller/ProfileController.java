package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Value("${app.message}")
    private String value;

    @GetMapping(value = "profile")
    public String getProfile() {
        return "Your active profile is "+value;
    }
}
