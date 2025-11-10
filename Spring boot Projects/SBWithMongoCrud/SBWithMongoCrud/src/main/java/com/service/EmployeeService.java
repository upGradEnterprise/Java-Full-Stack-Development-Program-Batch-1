package com.service;

import com.document.Employee;
import com.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public String storeEmployee(Employee employee){
        Optional<Employee> optionalEmployee = employeeRepository.findById(employee.getId());
        if(optionalEmployee.isPresent()){
            return "Employee id must be unique";
        }else {
            employeeRepository.save(employee);
            return "Employee record stored successfully";
        }
    }

    public List<Employee> findAll() {
        return   employeeRepository.findAll();
    }
}
