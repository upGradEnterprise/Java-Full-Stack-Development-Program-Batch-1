package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class ProductRestApiApplication {

	public static void main(String[] args) {

        SpringApplication.run(ProductRestApiApplication.class, args);
        System.out.println("Spring boot project rest api up!");
	}

}
