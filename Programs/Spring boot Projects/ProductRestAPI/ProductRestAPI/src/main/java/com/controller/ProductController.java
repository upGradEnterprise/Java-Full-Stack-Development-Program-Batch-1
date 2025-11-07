package com.controller;

import com.bean.Product;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class ProductController {
    static List<Product> productList;
    static {
        productList = new ArrayList<>();
        productList.add(new Product(1,"TV",45000));
        productList.add(new Product(2,"Computer",32000));
        productList.add(new Product(3,"Laptop",85000));
        productList.add(new Product(4,"Pen Driver",1500));
    }
    // http://localhost:8080/findAllProducts
    @RequestMapping(value = "findAllProducts",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> findAllProducts() {
        return productList;
    }

    // http://localhost:8080/findProductByQueryParam?pid=1
    @RequestMapping(value = "findProductByQueryParam",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Product findProductUsingQueryParam(@RequestParam("pid") int pid) {
        Iterator<Product> li =  productList.iterator();
        while (li.hasNext()) {
            Product product = li.next();
            if (product.getPid() == pid) {
                return product;
            }
        }
        return null;
    }

    // http://localhost:8080/findProductUsingPathParam/1
    @RequestMapping(value = "findProductUsingPathParam/{pid}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Product findProductUsingPathParam(@PathVariable("pid") int pid) {
        Iterator<Product> li =  productList.iterator();
        while (li.hasNext()) {
            Product product = li.next();
            if (product.getPid() == pid) {
                return product;
            }
        }
        return null;
    }

}
