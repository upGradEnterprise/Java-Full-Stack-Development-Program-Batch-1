package com;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private float salary;

    public Employee() {
    }

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
//    @Override
//    public boolean equals(Object obj){
//        Employee emp = (Employee) obj;
//        if(this.salary==emp.salary && this.id==emp.id && this.name.equals(name)){
//            return true;
//        }else {
//            return false;
//        }
//
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Float.compare(salary, employee.salary) == 0
                && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        //return 100;
        //return id+name.indexOf(0)+(int)salary;      // different code for emp1/emp2 and emp3/emp4
        return  Objects.hash(id,name,salary);
    }
}

// emp1 and emp2 (hashcode 100),   emp3 and emp4 (hashcode 100)