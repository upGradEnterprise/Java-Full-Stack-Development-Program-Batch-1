package com.pojo;

import com.bean.Employee;

public class Department {
    Employee emp1 = new Employee();
    public void disEmployeeInDepartment() {
       // System.out.println("id is "+emp.id);      // private
       // System.out.println("name is "+emp1.name); // default
       // System.out.println("salary is "+emp1.salary); // protected
        System.out.println("desg is "+emp1.designation);
    }
}
