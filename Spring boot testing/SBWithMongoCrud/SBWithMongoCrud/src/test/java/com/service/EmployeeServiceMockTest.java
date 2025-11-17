package com.service;

import com.document.Employee;
import com.repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@ExtendWith(MockitoExtension.class)     // this class we are writing mocking for service layer
@SpringBootTest
public class EmployeeServiceMockTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

    @Test
    public void fakeEmployeeServiceData() {
        // mock data
        Mockito.when(employeeRepository.findAll()).thenReturn(null);

        List<Employee> employeesFakeData  = employeeService.findAll();
        Assertions.assertNull(employeesFakeData);

    }
}
