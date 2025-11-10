package com.controller;

import com.service.ProductService;
import com.document.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping(value = "store",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String storeProduct(@RequestBody Product product){
        return productService.storeProduct(product);
    }

    @GetMapping(value = "find",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> findAllProduct() {
        return productService.findAllProducts();
    }
}
