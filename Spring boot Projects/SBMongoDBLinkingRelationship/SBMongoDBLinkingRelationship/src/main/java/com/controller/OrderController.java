package com.controller;

import com.document.Orders;
import com.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping(value = "place",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String placeOrder(@RequestBody Orders order){
        return orderService.orderPlace(order);
    }

    @GetMapping(value = "findAll",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Orders> getOrders(){
        return orderService.getOrders();
    }
}
