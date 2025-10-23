package com.service;

import com.bean.Product;

import java.util.ArrayList;
import java.util.List;

public interface ProductService {


    // pid must be unique
    public String addProduct(Product product);
    // retrieve all products
    public List<Product> findAllProducts();
    // if product present return that product details in string format else product not present
    public String searchProduct(int pid);
    // if product present update price and new price is > old price.
    public String updateProduct(Product product);
    // delete the product using pid if present else return no product present.
    public String deleteProduct(int pid);
}
