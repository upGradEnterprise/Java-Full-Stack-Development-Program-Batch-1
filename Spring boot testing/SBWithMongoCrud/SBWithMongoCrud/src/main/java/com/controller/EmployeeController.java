package com.controller;

import ch.qos.logback.classic.Logger;
import com.document.Employee;
import com.service.EmployeeService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    Logger logger = (Logger) LoggerFactory.getLogger(EmployeeController.class);

    @PostMapping(value = "store",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String storeEmployee(@RequestBody Employee employee){
        return employeeService.storeEmployee(employee);
    }

    @GetMapping(value = "find",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> findAll() {
        List<Employee> employees = employeeService.findAll();
        logger.info("Find All Employees"+employees.size());
        return  employees;
    }
}
