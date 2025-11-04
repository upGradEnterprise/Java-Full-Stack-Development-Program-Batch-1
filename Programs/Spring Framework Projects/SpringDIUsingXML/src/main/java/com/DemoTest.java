package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {
    public static void main(String[] args) {
        //Employee emp = new Employee();
        //emp.display();

        Resource res  = new ClassPathResource("beans.xml"); // load the beans.xml file from resource directory
        BeanFactory factory = new XmlBeanFactory(res);  // created BeanFactory interface reference.
//
//        Employee e1 = (Employee) factory.getBean("emp1");
//        e1.display();
//
//        Employee e2 = (Employee) factory.getBean("emp1");
//        e2.display();
//        System.out.println("---------------------------");
//        Employee e3 = (Employee) factory.getBean("emp2");
//        e3.display();
//
//        Employee e4 = (Employee) factory.getBean("emp2");
//        e4.display();

        Employee e5 = (Employee) factory.getBean("emp1");
        System.out.println(e5);

        Employee e6 = (Employee) factory.getBean("emp2");
        System.out.println(e6);

        Employee e7 = (Employee) factory.getBean("emp3");
        System.out.println(e7);
    }
}
