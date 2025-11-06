package com.service;

import com.bean.Product;
import com.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDao productDao;

    public String storeProduct(Product product) {
        if(product.getPrice()<1000){
            return "Product price must be >1000";
        }else if(productDao.storeProduct(product)>0){
            return "Product stored successfully";
        }else {
            return "Product didn't store";
        }
    }

    public List<Product> findAllProducts() {
        return productDao.findAllProducts();    // no bussiness logic
    }
}
