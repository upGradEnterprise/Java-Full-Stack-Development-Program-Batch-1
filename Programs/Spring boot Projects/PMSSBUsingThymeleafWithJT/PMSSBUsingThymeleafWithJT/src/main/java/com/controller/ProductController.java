package com.controller;

import com.bean.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String openIndexPage(Model model) {  // DI
        model.addAttribute("title", "Product Management System");
        return "index";
    }

    @RequestMapping(value = "/addProductPageOpen",method = RequestMethod.GET)
    public String openAddProductPage(Model model, Product product) {  // DI for model and product
        model.addAttribute("title", "Product Management System");
        model.addAttribute("product", product);
        return "addProduct";
    }

    @RequestMapping(value = "/storeProductInDb",method = RequestMethod.POST)
    public String storeProductInDb(Model model, Product product) {  // DI for model and product
        model.addAttribute("title", "Product Management System");
        model.addAttribute("product", product);
        System.out.println(product);  // toString method called..
            product.setPrice(0.0f);
            product.setPid(0);
            product.setPname("");
        return "addProduct";
    }

    @RequestMapping(value = "/viewProductPageOpen",method = RequestMethod.GET)
    public String openViewProductPage(Model model) {  // DI
        model.addAttribute("title", "Product Management System");
        return "viewProduct";
    }
}
