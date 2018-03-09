package com.singlestone.spring.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String customerId;
	private int numberOfItems;
	private double totalPrice;
	
	public OrderDetail(Long id, String customerId, int numberOfItems, double totalPrice) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.numberOfItems = numberOfItems;
		this.totalPrice = totalPrice;
	}

	public OrderDetail() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
