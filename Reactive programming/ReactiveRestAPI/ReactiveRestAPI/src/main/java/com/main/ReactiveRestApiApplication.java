package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class ReactiveRestApiApplication {

	public static void main(String[] args) {

        SpringApplication.run(ReactiveRestApiApplication.class, args);
        System.out.println("ReactiveRestApiApplication started");
	}

}
