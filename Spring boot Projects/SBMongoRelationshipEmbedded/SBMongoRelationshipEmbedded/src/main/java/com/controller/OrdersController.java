package com.controller;

import com.document.Orders;
import com.service.OrdersService;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orders")
public class OrdersController {


    @Autowired
    OrdersService ordersService;

    @PostMapping(value = "place",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String placeOrder(@RequestBody Orders orders){
        return   ordersService.placeOrder(orders);
    }
}
