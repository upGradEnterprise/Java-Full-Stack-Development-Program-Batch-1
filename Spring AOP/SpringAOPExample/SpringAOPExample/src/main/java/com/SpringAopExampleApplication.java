package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = "com")
@EnableAspectJAutoProxy
public class SpringAopExampleApplication {

	public static void main(String[] args) {

        SpringApplication.run(SpringAopExampleApplication.class, args);
        System.out.println("Spring boot with AOP concept");
	}

}
