package com.bean;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {
    @Id
    private int pid;
    private String pname;
    private float price;
    private int qty;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "pid") // link to orders table pi as fk
    private List<Orders> listOfOrders;

    public Product() {
        System.out.println("Product Constructor called.");
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public List<Orders> getListOfOrders() {
        return listOfOrders;
    }

    public void setListOfOrders(List<Orders> listOfOrders) {
        this.listOfOrders = listOfOrders;
    }
}
