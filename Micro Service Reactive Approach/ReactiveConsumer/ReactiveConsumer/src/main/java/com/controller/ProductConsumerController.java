package com.controller;

import com.service.ProductConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("reactive_consumer")
public class ProductConsumerController {

    @Autowired
    ProductConsumerService productConsumerService;

    @GetMapping(value = "say")
    public Mono<String> sayHell() {
        return Mono.justOrEmpty("Welcome to Reactive Consumer");
    }

    @GetMapping(value = "call_producer")
    public Mono<String> callProducer() {
        return productConsumerService.callProducer();
    }
}
