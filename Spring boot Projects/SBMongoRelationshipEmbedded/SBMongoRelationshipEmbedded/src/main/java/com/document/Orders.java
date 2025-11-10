package com.document;

import java.time.LocalDateTime;
// if you need embedded style don't user child or associate class @Document as well we @Id
public class Orders {
    private LocalDateTime orderDate;
    private int qty;
    private String pid;

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}
