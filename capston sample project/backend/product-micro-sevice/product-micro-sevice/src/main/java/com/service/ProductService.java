package com.service;

import com.document.Product;
import com.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public String storeProduct(Product product){
        return productRepository.save(product).getId();
    }

    public String deleteProduct(String id){
        Optional<Product> result = productRepository.findById(id);
        if(result.isPresent()){
            productRepository.deleteById(id);
            return "product deleted";
        }else {
            return "product not found";
        }
    }

    public String updateProduct(Product product){
        Optional<Product> result = productRepository.findById(product.getId());
        if(result.isPresent()){
            Product updatedProduct = result.get();
            updatedProduct.setQty(product.getQty());
            updatedProduct.setPrice(product.getPrice());
            updatedProduct.setPname(product.getPname());
            productRepository.save(updatedProduct);
            return "product updated";
        }else {
            return "product not found";
        }
    }
}
