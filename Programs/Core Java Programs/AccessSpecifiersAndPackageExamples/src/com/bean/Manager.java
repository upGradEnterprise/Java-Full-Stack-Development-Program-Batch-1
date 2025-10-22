package com.bean;

public class Manager extends  Employee{

    public void disManager() {
        //System.out.println("id is "+id);// it is private
        System.out.println("name is "+name);
        System.out.println("salary is "+salary);
        System.out.println("desg is "+designation);
    }
}
