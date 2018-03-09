package com.singlestone.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.singlestone.spring.boot.client.RestClient;
import com.singlestone.spring.boot.model.Product;

@Service
public class ProductService {

//	private ProductRepository productRepository;
	private List<Product> products;
	
	@Autowired
	public ProductService() {
		products = RestClient.getProducts();
		
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public Product getProduct(String Id) {
		Product productToReturn = null;
		for(Product product: products) {
			if(product.getId().equals(Id)) {
				productToReturn = product;
			}
		}
		
		return productToReturn;
	}
}
