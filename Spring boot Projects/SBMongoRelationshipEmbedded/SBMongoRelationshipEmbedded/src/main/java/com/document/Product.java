package com.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("Product")
public class Product {
    @Id
    private String id;
    private String pname;
    private String price;
    private int qty;
    private List<Orders> listOfOrders;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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
