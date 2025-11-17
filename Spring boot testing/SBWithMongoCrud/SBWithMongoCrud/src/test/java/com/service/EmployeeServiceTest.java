package com.service;

import com.document.Employee;
import com.repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@SpringBootApplication(scanBasePackages = "com")    // Enable @Service and @Repository
public class EmployeeServiceTest {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    Employee employee;
    @Test
    public void testFindAll() {
       List<Employee> listOfEmployees =  employeeService.findAll();
        Assertions.assertEquals(listOfEmployees.size(),3);
        Employee employee1 = listOfEmployees.get(0);
        Assertions.assertNotNull(employee1);
        Assertions.assertEquals(employee1.getId(),1);
        Assertions.assertEquals(employee1.getName(),"Raj");
        Assertions.assertEquals(employee1.getSalary(),45000);
    }
    @Test
    public void storeEmployee() {
        employee.setId(124);
        employee.setName("Vikash");
        employee.setSalary(48000);
        String result1 = employeeService.storeEmployee(employee);
        Assertions.assertEquals("Employee record stored successfully",result1);

        String result2 = employeeService.storeEmployee(employee);
        Assertions.assertEquals("Employee id must be unique",result2);
    }
}
