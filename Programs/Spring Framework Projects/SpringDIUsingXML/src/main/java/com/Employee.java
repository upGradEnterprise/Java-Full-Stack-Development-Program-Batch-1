package com;

public class Employee {
    private int id;
    private String name;
    private float salary;

    public void display() {
        System.out.println("display method");
    }
    Employee() {
        System.out.println("object created with empty constructor");

    }

    public Employee(int id, String name, float salary) {
        System.out.println("object created with parameterized constructor");
        this.id = id;
        this.name = name;
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
}
