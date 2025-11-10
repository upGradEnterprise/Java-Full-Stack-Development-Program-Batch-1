package com.controller;

import com.bean.Product;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "findAllProducts",method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> findAllProducts(){

        return productService.findAllProducts();
    }

    @RequestMapping(value = "storeProduct",method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String storeProduct(@RequestBody Product product){

        return productService.storeProduct(product);
    }

    @RequestMapping(value = "updateProduct",method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String updateProduct(@RequestBody Product product){

        return productService.updateProduct(product);
    }

    @RequestMapping(value = "deleteProduct/{pid}",method = RequestMethod.DELETE)
    public String deleteProduct(@PathVariable("pid") int pid){

        return productService.deleteProduct(pid);
    }

    @RequestMapping(value = "findProductUsingPathParam/{pid}",method = RequestMethod.GET)
    public String searchProduct(@PathVariable("pid") int pid){

        return productService.findProductById(pid);
    }

}
