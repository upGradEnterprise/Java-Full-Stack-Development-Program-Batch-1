package com.service;

import com.document.Product;
import com.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
@Autowired
    private ProductRepository productRepository;

    public String storeProduct(Product product){
        productRepository.save(product);
        return "Product stored ";
    }
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
