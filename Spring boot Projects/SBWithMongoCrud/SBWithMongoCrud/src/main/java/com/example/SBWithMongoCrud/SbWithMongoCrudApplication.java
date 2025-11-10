package com.example.SBWithMongoCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com")        // @Restcontroller, @Service, @Repository
@EnableMongoRepositories(basePackages = "com.repository")   // mongo repository
public class SbWithMongoCrudApplication {

	public static void main(String[] args) {

        SpringApplication.run(SbWithMongoCrudApplication.class, args);
        System.out.println("Spring boot rest api with mongo db");
	}

}
