package com.singlestone.spring.boot.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.singlestone.spring.boot.model.Product;


public class RestClient {

//	final static String uri = "https://bitpay.com/api/rates";
	final static String uri = "https://petstoreapp.azurewebsites.net/api/products";
	private static List<Product >productList;
	
	public static List<Product> getProducts() {
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		Object[] forNow = restTemplate.getForObject(uri, Object[].class);
		List<Object> searchList = Arrays.asList(forNow);

		ObjectMapper mapper = new ObjectMapper();

		productList = new ArrayList<>();
		for (int i = 0; i < searchList.size(); i++) {
//			System.out.println(searchList.get(i));
			Product product = mapper.convertValue(searchList.get(i), Product.class);
//			System.out.println(product.getId());
			productList.add(product);
		}

		return productList;

	}
		
	public static Product getProduct(String Id) {
		return productList.stream().filter(t -> t.getId().equals(Id)).findFirst().get();
	}
}
