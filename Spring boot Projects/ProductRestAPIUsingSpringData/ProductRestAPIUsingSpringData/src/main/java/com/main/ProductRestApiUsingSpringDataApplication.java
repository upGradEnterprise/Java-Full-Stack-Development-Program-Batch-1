package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")  // Enable @RestController, @Service, @Repository,
@EntityScan(basePackages = "com.bean")      // Enable @Entity annotation
@EnableJpaRepositories(basePackages = "com.repository")  // Enable Spring JPA Features
public class ProductRestApiUsingSpringDataApplication {

	public static void main(String[] args) {

        SpringApplication.run(ProductRestApiUsingSpringDataApplication.class, args);
        System.out.println("Product Rest API Using Spring Data Application");

	}

}
