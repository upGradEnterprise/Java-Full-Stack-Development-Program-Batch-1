package com.bean;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDateTime;

@Entity                 // table name is orders
public class Orders {       // if table name more than one word order_details
    @Id                 // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto_increment
    private int oid;
    private int pid;
    private int qty;
    @Column(name = "orderdlacedate")
    private LocalDateTime orderPlaceDate;   // it create column as order_place_date

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public LocalDateTime getOrderPlaceDate() {
        return orderPlaceDate;
    }

    public void setOrderPlaceDate(LocalDateTime orderPlaceDate) {
        this.orderPlaceDate = orderPlaceDate;
    }
}
