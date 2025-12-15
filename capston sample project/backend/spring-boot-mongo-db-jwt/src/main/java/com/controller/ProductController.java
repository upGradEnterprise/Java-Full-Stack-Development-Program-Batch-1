package com.controller;

import com.model.Product;
import com.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    private final ProductRepository productRepository;

    // ADMIN only (by SecurityConfig)
    @PostMapping(value = "storeProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Product addProduct(@RequestBody Product product) {
    	System.out.println("product controller called.");
        return productRepository.save(product);
    }

    // ADMIN + CUSTOMER
    @GetMapping(value = "find",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
