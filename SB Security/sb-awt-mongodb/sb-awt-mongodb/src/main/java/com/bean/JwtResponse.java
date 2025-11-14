package com.bean;

import java.util.List;


public record JwtResponse(String token, String type, String id, String email, List<String> roles) {}
