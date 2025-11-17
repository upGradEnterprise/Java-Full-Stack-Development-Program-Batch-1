package com.example.SBWithMongoCrud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.validation.annotation.Validated;

@SpringBootApplication(scanBasePackages = "com")        // @Restcontroller, @Service, @Repository
@EnableMongoRepositories(basePackages = "com.repository")   // mongo repository
public class SbWithMongoCrudApplication {

    static Logger logger = (Logger) LoggerFactory.getLogger(SbWithMongoCrudApplication.class);
	//static Logger logger = LoggerFactory.getLogger(SbWithMongoCrudApplication.class);
    public static void main(String[] args) {

        SpringApplication.run(SbWithMongoCrudApplication.class, args);
        //System.out.println("Spring boot rest api with mongo db");
        logger.info("Spring boot up...");
	}

}
