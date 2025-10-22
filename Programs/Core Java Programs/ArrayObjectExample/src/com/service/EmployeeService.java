package com.service;

import com.bean.Employee;

public class EmployeeService {
    Employee employees[]=new Employee[10];
    public static int index =0;
    // business methods
    public String addEmployee(Employee employee){
        employees[index]=employee;
        index++;
        return "Employee record stored";
    }

    public Employee[] getAllEmployee() {
        return employees;
    }
}
