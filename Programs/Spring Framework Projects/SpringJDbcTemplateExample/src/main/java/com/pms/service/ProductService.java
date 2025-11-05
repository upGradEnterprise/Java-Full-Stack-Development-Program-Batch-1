package com.pms.service;

import com.pms.bean.Product;
import com.pms.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    ProductDao productDao;

    public String storeProduct(Product product)
    {
        if(productDao.storeProduct(product)>0){
            return "Product stored";
        }else {
            return "Product not stored";
        }
    }

//    public List<Product> findAll() {
//        return productDao.findAll();
//    }

    public List<Map<String,Object>> findAllProductsAsMap() {
        return productDao.findAllProductsAsMapObject();
    }

    public List<Product> findAllProductsAsList() {
        return productDao.findAllProductsAsListObjects().stream().filter(p->p.getPrice()>50000).collect(Collectors.toList());
    }
}
