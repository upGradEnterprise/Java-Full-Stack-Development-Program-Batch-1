package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class ApackeKafkaConsumerApplication {

	public static void main(String[] args) {

        SpringApplication.run(ApackeKafkaConsumerApplication.class, args);
        System.out.println("Kafka Consumer Application Started on port number 8181");
	}

}
