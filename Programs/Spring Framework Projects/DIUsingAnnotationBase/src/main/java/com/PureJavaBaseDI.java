package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PureJavaBaseDI {
    public static void main(String[] args) {
        // we are loading configuration class.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Employee emp = (Employee) context.getBean("employee");
                System.out.println(emp);
    }
}
