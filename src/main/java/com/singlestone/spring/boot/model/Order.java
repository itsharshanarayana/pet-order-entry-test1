package com.singlestone.spring.boot.model;

import java.util.List;


import javax.persistence.OneToMany;

public class Order {

	private String customerId;
	
	@OneToMany(targetEntity=Item.class)
	private List<Item> items;
	
//	private double total;

//	public double getTotal() {
//		return total;
//	}
//
//	public void setTotal(double total) {
//		this.total = total;
//	}

	public Order() {
		super();
	}

	public Order(String customerId, List<Item> items) {
		super();
		this.customerId = customerId;
		this.items = items;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public void addListItem(Item item) {
		items.add(item);
	}
	
	public void removeListItem(Item item) {
		if(items.contains(item))
			items.remove(item);
	}
	
}
