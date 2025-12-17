package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringProfileAppApplication {

	public static void main(String[] args) {

        SpringApplication.run(SpringProfileAppApplication.class, args);
	    System.out.println("Spring Profile Application Started");
    }


}
