package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableDiscoveryClient
public class ProducerMicroServiceApplication {

	public static void main(String[] args) {

        SpringApplication.run(ProducerMicroServiceApplication.class, args);
        System.out.println("Producer Micro Service Application Started on port number 8181");
	}

}
