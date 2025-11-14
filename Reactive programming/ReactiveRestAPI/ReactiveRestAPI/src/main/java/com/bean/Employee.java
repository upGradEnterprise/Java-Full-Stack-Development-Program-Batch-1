package com.bean;

public class Employee {
    private int eid;
    private String ename;
    private float salary;

    public Employee(int eid, String ename, float salary) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
