package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EnableMongoRepositories(basePackages = "com.repository")
public class SbMongoDbLinkingRelationshipApplication {

	public static void main(String[] args) {

        SpringApplication.run(SbMongoDbLinkingRelationshipApplication.class, args);
	    System.out.println("Spring boot mongo linking style project up!");
        }

}
