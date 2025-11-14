package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("reactive_producer")
public class ProducController {

    @GetMapping(value = "greeting")
    public Mono<String> greeting() {
        return Mono.just("Welcome to Reactive Producer application");
    }
}
