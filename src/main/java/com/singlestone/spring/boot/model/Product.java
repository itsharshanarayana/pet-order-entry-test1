package com.singlestone.spring.boot.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product{

	private String Id;
	private String Category;
	private String Name;
	private Double Price;
	
	public Product() {
		
	}
	
	@Autowired
	public Product(String Id, String Category, String Name, Double Price) {
		this.Id = Id;
		this.Category = Category;
		this.Name = Name;
		this.Price = Price;
	}

	public String getId() {
		return Id;
	}

	@JsonProperty("Id")
	public void setId(String Id) {
		this.Id = Id;
	}

	public String getCategory() {
		return Category;
	}

	@JsonProperty("Category")
	public void setCategory(String Category) {
		this.Category = Category;
	}

	public String getName() {
		return Name;
	}

	@JsonProperty("Name")
	public void setName(String Name) {
		this.Name = Name;
	}

	public Double getPrice() {
		return Price;
	}

	@JsonProperty("Price")
	public void setPrice(Double Price) {
		this.Price = Price;
	}

	@Override
	public String toString() {
		return "Product{" +
				"\"Id\":" +  this.Id + "\"" +
				"\"Name\":" + this.Name + "\"" +
				"\"Category\":" + this.Category + "\"" +
				"\"Price\":" + this.Price + "\"" +
				"}";
	}
	
}
