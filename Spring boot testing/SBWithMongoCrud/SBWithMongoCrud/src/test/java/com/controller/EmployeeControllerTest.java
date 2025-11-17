package com.controller;

import com.document.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@SpringBootApplication(scanBasePackages = "com")
public class EmployeeControllerTest {

    @Autowired
    Employee employee;

    @Test
    //@Disabled
    public void findAllTest()
    {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/employee/find";
        List<Employee> listOfEmp= restTemplate.getForObject(url, List.class);
        Assertions.assertNotNull(listOfEmp);
        Assertions.assertEquals(listOfEmp.size(),5);
    }


    @Test
    //@Disabled
    public void storeEmployeeTest() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/employee/store";
        employee.setId(456);
        employee.setName("James Bond");
        employee.setSalary(56000);
        String result =  restTemplate.postForObject(url, employee, String.class);
        Assertions.assertEquals("Employee record stored successfully",result);
    }
}
