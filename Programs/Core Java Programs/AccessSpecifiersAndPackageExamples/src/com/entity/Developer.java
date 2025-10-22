package com.entity;

import com.bean.Employee;

public class Developer extends Employee {
    public void disDeveloper() {
        //System.out.println("id is "+id);  // it is private
        //System.out.println("name is "+name); // it is default
        System.out.println("salary is "+salary);
        System.out.println("desg is "+designation);
    }
}
