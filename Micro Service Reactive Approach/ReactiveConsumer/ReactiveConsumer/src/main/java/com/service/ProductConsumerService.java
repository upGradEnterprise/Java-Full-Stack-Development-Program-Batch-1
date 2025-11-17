package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ProductConsumerService {
    @Autowired
    WebClient webClient;


    public Mono<String> callProducer() {
       //return webClient.get().uri("http://localhost:8080/reactive_producer/greeting").retrieve().bodyToMono(String.class);
        return webClient.get().uri("http://REACTIVEPRODUCER/reactive_producer/greeting").retrieve().bodyToMono(String.class);
    }
}
