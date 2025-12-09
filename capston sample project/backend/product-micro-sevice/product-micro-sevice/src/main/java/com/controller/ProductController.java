package com.controller;

import com.document.Product;
import com.netflix.discovery.converters.Auto;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
@CrossOrigin()   // this end point can call by end front end technologies.
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "find",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> findAll(){
        return productService.findAll();
    }
    @PostMapping(value = "store",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public String store(@RequestBody Product product){
        return productService.storeProduct(product);
    }

    @DeleteMapping(value = "delete/{id}")
    public String deleteProduct(@PathVariable("id") String id){
        return productService.deleteProduct(id);
    }

    @PatchMapping(value = "update",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public String update(@RequestBody Product product){
        return productService.updateProduct(product);
    }
}
