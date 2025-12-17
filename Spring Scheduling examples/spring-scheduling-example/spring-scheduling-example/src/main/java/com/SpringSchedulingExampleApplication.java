package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringSchedulingExampleApplication {

	public static void main(String[] args) {

        SpringApplication.run(SpringSchedulingExampleApplication.class, args);
        System.out.println("Spring boot Scheduling Example Application has been started");
	}

}
