package com.controller;


import com.document.Employee;
import com.service.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;  // unit
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;  // mockito
import org.springframework.boot.test.context.SpringBootTest;    // spring

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)     // this class we are writing mocking for service layer
@SpringBootTest
public class EmployeeControllerMockTest {


    @Mock
    EmployeeService employeeService;

    @InjectMocks
    EmployeeController employeeController;

    @Test
    public void mockFindEmployeeData() {

        // provide fake or proxy data
        List<Employee> employeesFakeData = new ArrayList<>();
        employeesFakeData.add(new Employee(100,"Mahesh",34000));
        employeesFakeData.add(new Employee(101,"Vikash",34000));
        Mockito.when(employeeService.findAll()).thenReturn(employeesFakeData);


        // start the testing for controller
        List<Employee> employeeResult = employeeController.findAll();
        Assertions.assertEquals(2, employeeResult.size());
        Assertions.assertEquals(101, employeeResult.get(0).getId());

    }
}
