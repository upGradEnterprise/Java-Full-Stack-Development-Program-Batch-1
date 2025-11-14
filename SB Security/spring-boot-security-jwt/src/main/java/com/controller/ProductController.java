package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@PostMapping(value = "admin/addProduct")
	public String addProduct()
	{
		return "Admin Can Add Product";
	}
	
	@GetMapping(value = "user/viewProduct")
	public String viewProduct()
	{
		return "Admin as well as User can View Product";
	}

}
