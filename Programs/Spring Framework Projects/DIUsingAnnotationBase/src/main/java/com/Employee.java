package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component          // <bean class="com.Employee"></bean> id is employee
@Scope("prototype")
public class Employee {
    @Value(value = "100")
    private int id;
    @Value(value = "Ajay")
    private String name;
    @Value(value = "45000")
    private float salary;
    @Autowired    // by default byType consider
    private Address add;

    public Employee() {
    }

    public Employee(int id, String name, float salary, Address add) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.add = add;
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

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", add=" + add +
                '}';
    }
}
