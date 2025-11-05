package com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration      // is like a xml file
@ComponentScan(basePackages = "com")    // Enable @Component anntoation
public class MyConfiguration {
}
