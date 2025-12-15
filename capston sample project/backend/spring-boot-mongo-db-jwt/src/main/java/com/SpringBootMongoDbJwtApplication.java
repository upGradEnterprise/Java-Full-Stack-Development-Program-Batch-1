package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EnableMongoRepositories(basePackages = "com.repository")
public class SpringBootMongoDbJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDbJwtApplication.class, args);
		System.out.println("spring boot security up");
	}

}
