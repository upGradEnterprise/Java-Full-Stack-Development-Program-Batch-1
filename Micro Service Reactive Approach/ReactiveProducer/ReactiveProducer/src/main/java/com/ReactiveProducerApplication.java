package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class ReactiveProducerApplication {

	public static void main(String[] args) {

        SpringApplication.run(ReactiveProducerApplication.class, args);
        System.out.println("Reactive Producer Application Started on port number 8080");
	}

}
