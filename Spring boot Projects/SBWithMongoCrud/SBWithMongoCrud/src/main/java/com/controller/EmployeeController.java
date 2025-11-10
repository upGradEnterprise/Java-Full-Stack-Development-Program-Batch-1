package com.controller;

import com.document.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "store",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String storeEmployee(@RequestBody Employee employee){
        return employeeService.storeEmployee(employee);
    }

    @GetMapping(value = "find",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> findAll() {
        return  employeeService.findAll();
    }
}
