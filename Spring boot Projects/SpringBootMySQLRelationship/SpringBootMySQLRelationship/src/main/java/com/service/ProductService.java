package com.service;

import com.bean.Product;
import com.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public String storeProduct(Product product){
        if(productRepository.existsById(product.getPid())){
            return "Product id must be unique";
        }else {
            productRepository.save(product);
            return "Product stored successfully";
        }
    }
    public List<Product> findAll(){
        return productRepository.findAll();
    }
}
