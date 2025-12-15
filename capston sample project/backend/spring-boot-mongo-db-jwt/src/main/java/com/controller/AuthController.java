package com.controller;

import com.dto.AuthResponse;
import com.model.User;
import com.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public Map<String, String> signUp(@RequestBody User user) {
        String message = authService.signup(user);
        return Map.of("message", message);
    }

    @PostMapping("/signin")
    public Map<String, String> signIn(@RequestBody User user) {
        AuthResponse response = authService.signin(user.getEmail(), user.getPassword());
        return Map.of("token", response.getToken(),"role", response.getRole());   // Admin or Customer
    }
}
