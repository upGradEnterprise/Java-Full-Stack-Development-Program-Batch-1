package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class ApackeKafkaProducerApplication {

	public static void main(String[] args) {

        SpringApplication.run(ApackeKafkaProducerApplication.class, args);
        System.out.println("Apache Kafka Producer Application Started on port number 8282");
	}

}
