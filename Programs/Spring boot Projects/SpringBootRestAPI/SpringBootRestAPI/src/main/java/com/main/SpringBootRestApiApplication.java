package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com") // scan or enable @Controller, @Service, @Repository, @Component
public class SpringBootRestApiApplication {

	public static void main(String[] args) {

        SpringApplication.run(SpringBootRestApiApplication.class, args);
        System.out.println("Spring boot rest api up!");
	}

}
