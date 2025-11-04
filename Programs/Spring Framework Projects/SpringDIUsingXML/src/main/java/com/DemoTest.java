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
        Employee e1 = (Employee) factory.getBean("emp1");
        e1.display();
    }
}
