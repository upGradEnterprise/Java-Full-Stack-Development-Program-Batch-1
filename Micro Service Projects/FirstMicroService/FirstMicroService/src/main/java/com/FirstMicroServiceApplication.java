package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableDiscoveryClient      // when w
public class FirstMicroServiceApplication {

	public static void main(String[] args) {

        SpringApplication.run(FirstMicroServiceApplication.class, args);
        System.err.println("First Micro Service project running on port number 8080");
	}

}
