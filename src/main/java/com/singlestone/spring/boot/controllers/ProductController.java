package com.singlestone.spring.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.singlestone.spring.boot.model.Product;
import com.singlestone.spring.boot.services.ProductService;

@RestController
public class ProductController {
	
	private ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(value="/products", method=RequestMethod.GET)
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	
	@RequestMapping(value="/products/{Id}", method=RequestMethod.GET)
	public Product getProduct(@PathVariable("Id") String Id) {
		return productService.getProduct(Id);
	}
	
	
}
