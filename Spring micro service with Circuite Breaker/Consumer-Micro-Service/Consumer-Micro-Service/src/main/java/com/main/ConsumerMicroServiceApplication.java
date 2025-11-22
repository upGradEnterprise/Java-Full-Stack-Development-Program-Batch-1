package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com")
@EnableDiscoveryClient
//@EnableScheduling
public class ConsumerMicroServiceApplication {

	public static void main(String[] args) {

        SpringApplication.run(ConsumerMicroServiceApplication.class, args);
        System.out.println("ConsumerMicroServiceApplication started on port number 8282");
	}

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
