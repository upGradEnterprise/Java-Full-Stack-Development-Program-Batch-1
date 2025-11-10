package com.service;

import com.document.Orders;
import com.document.Product;
import com.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {
    @Autowired
    ProductRepository productRepository;

    public String placeOrder(Orders orders){            // pid, qty
        Optional<Product> result = productRepository.findById(orders.getPid());
        if(result.isPresent()){
                Product productFromDb = result.get();
                if(productFromDb.getQty()>=orders.getQty()){
                        orders.setOrderDate(LocalDateTime.now());
                        List<Orders> oldOrderDetails = productFromDb.getListOfOrders();
                        if(oldOrderDetails==null) {
                            oldOrderDetails = new ArrayList<>();
                        }
                        oldOrderDetails.add(orders);
                        productFromDb.setListOfOrders(oldOrderDetails);
                        productFromDb.setQty(productFromDb.getQty() - orders.getQty());
                        productRepository.save(productFromDb);
                        return "Order placed successfully";
                }else {
                    return "Qty must be equal or less that present qty";
                }
        }else {
            return "Product not present";
        }
    }

}
