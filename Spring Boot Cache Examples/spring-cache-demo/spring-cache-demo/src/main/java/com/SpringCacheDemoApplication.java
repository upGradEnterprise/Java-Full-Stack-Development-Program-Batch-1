package com;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages = "com")
@EnableCaching
public class SpringCacheDemoApplication {

	public static void main(String[] args) {

        SpringApplication.run(SpringCacheDemoApplication.class, args);
        System.out.println("spring boot cache example up...");
	}

}
