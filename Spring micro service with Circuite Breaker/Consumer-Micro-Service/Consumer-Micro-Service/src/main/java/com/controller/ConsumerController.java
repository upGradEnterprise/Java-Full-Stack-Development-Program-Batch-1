package com.controller;

import com.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping(value = "service")
    public String callService(){
        return consumerService.callProducer();
    }
}
