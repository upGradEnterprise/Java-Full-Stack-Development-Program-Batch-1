package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com")
@EnableMongoRepositories(basePackages = "com.repository")
public class GpayMicroServiceApplication {

	public static void main(String[] args) {

        SpringApplication.run(GpayMicroServiceApplication.class, args);
        System.out.println("GpayMicroServiceApplication started with port number 8383");
	}

    // if method with @Bean annotation that method
    // called by container . object we created
    // but maintain by container.
    @Bean
    @LoadBalanced   // on rest template creation method
    public RestTemplate getRestTemplate() {
        System.out.println("Rest Template created....");
        RestTemplate obj = new RestTemplate();
        return obj;
    }
}
