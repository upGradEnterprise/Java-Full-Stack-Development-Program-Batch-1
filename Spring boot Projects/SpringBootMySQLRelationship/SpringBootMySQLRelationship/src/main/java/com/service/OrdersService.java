package com.service;

import com.bean.Orders;
import com.bean.Product;
import com.repository.OrdersRepository;
import com.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class OrdersService {

    @Autowired
    OrdersRepository ordersRepository;
    @Autowired
    ProductRepository productRepository;
    public String placeOrder(Orders order){
            Optional<Product> result  =  productRepository.findById(order.getPid());
            if(result.isPresent()){
                Product productFromDb  = result.get();
                if(productFromDb.getQty() >= order.getQty()){
                        order.setOrderPlaceDate(LocalDateTime.now());
                        ordersRepository.save(order);
                        productFromDb.setQty(productFromDb.getQty() - order.getQty());
                        productRepository.saveAndFlush(productFromDb);
                        return "Order Placed successfully";
                }else {
                    return "Qty less than or equal to order Qty";
                }
            }else {
                return "Product Not Found";
            }
    }
}
