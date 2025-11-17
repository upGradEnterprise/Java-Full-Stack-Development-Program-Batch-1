package com.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public String businessMethod(){
        return "Welcome to Spring boot service method";
    }
}
