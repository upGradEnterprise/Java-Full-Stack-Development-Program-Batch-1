package com.document;

import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.context.annotation.Scope;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document
@Component
@Scope("prototype")
public class Employee {
    @Id
    private int id;
    @NotBlank(message = "name is required")
    //@Length(min = 2, max = 5)
    @Pattern(regexp = "[a-z]+")
    private String name;
    @Min(value = 8000,message = "Salary must be min 8000")
    @Max(value = 50000,message = "Salary be be max 50000")
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
}
