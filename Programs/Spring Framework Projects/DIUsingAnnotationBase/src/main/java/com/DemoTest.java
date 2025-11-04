package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
    public static void main(String[] args) {
        // load the xml file and provide the reference of ApplicationContext
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Address add1 = (Address) ac.getBean("address");
        System.out.println(add1);
        Employee e1 = (Employee) ac.getBean("employee");
        System.out.println(e1);
        e1.setName("Raju");
        System.out.println(e1);
    }
}
