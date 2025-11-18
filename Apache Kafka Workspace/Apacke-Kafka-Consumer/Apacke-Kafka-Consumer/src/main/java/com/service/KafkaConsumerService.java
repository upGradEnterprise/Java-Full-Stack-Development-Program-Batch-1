package com.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "topic1")
    public void receiveMessage(@Payload String message){
        System.out.println("Received message: " + message);
    }
}
