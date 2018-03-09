package com.singlestone.spring.boot.model;

public class Item {

	private int quantity;
	private String productId;
	
	public Item() {
		super();
	}
	
	public Item(int quantity, String productId) {
		super();
		this.quantity = quantity;
		this.productId = productId;
	}
	

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
}
