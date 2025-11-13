package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EnableMongoRepositories(basePackages = "com.repository")
public class SbMongoDbHashPasswordApplication {

	public static void main(String[] args) {

        SpringApplication.run(SbMongoDbHashPasswordApplication.class, args);
        System.out.println("Spring boot security with mongo db");
	}

}
