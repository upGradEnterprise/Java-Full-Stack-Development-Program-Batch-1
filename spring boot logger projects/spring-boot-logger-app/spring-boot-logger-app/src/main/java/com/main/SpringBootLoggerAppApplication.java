package com.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLoggerAppApplication {
    static Logger logger = LoggerFactory.getLogger(SpringBootLoggerAppApplication.class);
	public static void main(String[] args) {

        SpringApplication.run(SpringBootLoggerAppApplication.class, args);
        logger.debug("Hello World- debug message");
        logger.warn("Hello World - warn message");
        logger.error("Hello World- error message");
        logger.info ("Hello World- info message");
	}

}
