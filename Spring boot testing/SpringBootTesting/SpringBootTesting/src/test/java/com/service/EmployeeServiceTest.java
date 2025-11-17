package com.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    EmployeeService employeeService;

    @Test
    @Disabled
    public void testBusinessMethod() {
        String result = employeeService.businessMethod();
        Assertions.assertEquals("Welcome to Spring boot dao method", result);
    }
}
