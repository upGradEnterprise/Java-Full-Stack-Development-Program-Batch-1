package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication(scanBasePackages = "com")
public class ReactiveConsumerApplication {

	public static void main(String[] args) {

        SpringApplication.run(ReactiveConsumerApplication.class, args);
        System.out.println("Reactive Consumer Application Started on port number 8181");
	}


    @Bean
    public WebClient webClient() {
        return WebClient.create();
    }
}
