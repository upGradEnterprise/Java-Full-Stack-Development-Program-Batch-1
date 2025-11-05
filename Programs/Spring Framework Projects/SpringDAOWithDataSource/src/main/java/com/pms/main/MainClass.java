package com.pms.main;

import com.pms.bean.Product;
import com.pms.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        ProductService ps = (ProductService) ac.getBean("productService");
//        Product p = (Product) ac.getBean("product");
//        p.setPid(101);
//        p.setPname("Computer");
//        p.setPrice(45000);
//        String result = ps.storeProduct(p);
//        System.out.println(result);

        ps.findAll().forEach(System.out::println);
    }
}
