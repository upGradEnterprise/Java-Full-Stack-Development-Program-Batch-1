package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EnableMongoRepositories(basePackages = "com.repository")
@EnableDiscoveryClient
public class ProductMicroSeviceApplication {

	public static void main(String[] args) {

        SpringApplication.run(ProductMicroSeviceApplication.class, args);
        System.out.println("Product Micro Sevice Application has been started on port number 8080");
	}

}
