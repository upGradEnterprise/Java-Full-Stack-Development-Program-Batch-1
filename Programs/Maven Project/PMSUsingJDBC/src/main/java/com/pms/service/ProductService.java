package com.pms.service;

import com.pms.bean.Product;
import com.pms.dao.ProductDao;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    ProductDao pd = new ProductDao();

    public String storeProduct(Product product){
        if(product.getPrice()<1000){
            return "Product price must be >1000";
        }else if(pd.storeProduct(product)>0){
            return "Product stored";
        }else {
            return "Product didn't store";
        }
    }

    public List<Product> findAllProducts() {
        // Before Java 8
//        List<Product> listOfProducts = pd.findProduct();
//        Iterator<Product> li = listOfProducts.iterator();
//        while(li.hasNext()){
//            Product p = li.next();
//            float discount = p.getPrice()*0.10f;
//            p.setPrice(p.getPrice()-discount);
//        }
//        return listOfProducts;

        // after Java 8.
        return pd.findProduct().stream().map(p->new Product(p.getPid(),p.getPname(),p.getPrice()-p.getPrice()*0.10f)).collect(Collectors.toList());
    }
}
