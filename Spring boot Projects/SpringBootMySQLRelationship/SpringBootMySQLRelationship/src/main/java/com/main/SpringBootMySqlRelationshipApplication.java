package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")
@EnableJpaRepositories(basePackages = "com.repository")
public class SpringBootMySqlRelationshipApplication {

	public static void main(String[] args) {

        SpringApplication.run(SpringBootMySqlRelationshipApplication.class, args);
        System.out.println("Spring boot with JPA relationship");
	}

}
