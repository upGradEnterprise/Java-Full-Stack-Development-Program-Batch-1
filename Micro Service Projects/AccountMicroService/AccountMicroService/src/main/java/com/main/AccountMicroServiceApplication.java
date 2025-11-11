package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")
@EnableJpaRepositories(basePackages = "com.repository")
@EnableDiscoveryClient
public class AccountMicroServiceApplication {

	public static void main(String[] args) {

        SpringApplication.run(AccountMicroServiceApplication.class, args);
        System.err.println("Account MicroServiceApplication started on port number 8282");

	}

}
