package com.example.SbSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SbSecurityApplication {

	public static void main(String[] args) {

        SpringApplication.run(SbSecurityApplication.class, args);
        System.out.println("spring boot security up");

    }

}
