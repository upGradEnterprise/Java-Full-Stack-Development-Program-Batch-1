package com.bean;

import jakarta.validation.constraints.*;
import java.util.Set;


public class SignupRequest {
    @NotBlank
    @Email
    private String email;


    @NotBlank
    @Size(min = 6, max = 40)
    private String password;


    private Set<String> role; // optional

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRole() {
        return role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }
}
