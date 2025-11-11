package com.service;

import com.document.Orders;
import com.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrdersRepository ordersRepository;

    public String orderPlace(Orders order){
        order.setOrderDateTime(LocalDateTime.now());

        System.out.println(order);
        // using product id find the product details and check the qty
        // verify order place qty and actual qty and
        // sub and find the total amount
        // set the total amount. 

        ordersRepository.save(order);

        return "order done!";
    }

    public List<Orders> getOrders(){
        return ordersRepository.findAll();
    }
}
