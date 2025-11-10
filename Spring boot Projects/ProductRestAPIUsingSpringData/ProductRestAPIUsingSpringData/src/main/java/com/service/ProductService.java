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

    public List<Product> findAllProducts() {
        return productRepository.findAll(); // findAll pre defined method of JpaRepository
    }

    public String storeProduct(Product product){
            //productRepository.save(product);        // like insert query
            //return "Record stored";

         Optional<Product> result= productRepository.findById(product.getPid());
         if(result.isPresent()){
             return "Product id must be unique";
         }else {
             productRepository.save(product);
             return "Record inserted successfully";
         }
    }

    public String updateProduct(Product product){           // pid, price (new price)
        //productRepository.save(product);        // like insert query
        //return "Record stored";

        Optional<Product> result= productRepository.findById(product.getPid());
        if(result.isPresent()){
            Product productFromDb =  result.get();  // p object from db using pid
            productFromDb.setPrice(product.getPrice());
            productRepository.saveAndFlush(productFromDb);      // like update query
            return "Product updated successfully";
        }else {
            return "Product not present";
        }
    }

    public String deleteProduct(int pid){           // pid, price (new price)
        //productRepository.save(product);        // like insert query
        //return "Record stored";

        Optional<Product> result= productRepository.findById(pid);
        if(result.isPresent()){
            productRepository.deleteById(pid);
            return "Product deleted successfully";
        }else {
            return "Product not present";
        }
    }

    public String findProductById(int pid){
        Optional<Product> result= productRepository.findById(pid);
        if(result.isPresent()){
            Product productFromDb =  result.get();
            return productFromDb.toString();
        }else {
            return "Product not present";
        }
    }
}
