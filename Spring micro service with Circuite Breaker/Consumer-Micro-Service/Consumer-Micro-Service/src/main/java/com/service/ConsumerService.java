package com.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {
    @Autowired
    RestTemplate restTemplate;


    //@CircuitBreaker(name="msgService",fallbackMethod = "fallbackMethod")
    @Retry(name = "myTryInstance",fallbackMethod = "reTryFallback")
    //@Scheduled(fixedRate = 1000)
    public String callProducer(){
        System.err.print("Retrying calling external service....");
        return "Calling through 8282 port number "+restTemplate.getForObject("http://PRODUCER-MICRO-SERVICE/producer/service", String.class);
    }

    public String fallbackMethod(Throwable throwable){
        return "fallback - Producer Micro Service unavailable";
    }
    public String reTryFallback(Throwable throwable){
        return "fallback - Producer Micro Service unavailable, after many re try";
    }
}
