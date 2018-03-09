package com.singlestone.spring.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.singlestone.spring.boot.client.RestClient;
import com.singlestone.spring.boot.model.Item;
import com.singlestone.spring.boot.model.Order;
import com.singlestone.spring.boot.model.OrderDetail;
import com.singlestone.spring.boot.repos.OrderDetailRepository;

@RestController
public class OrderEntryController {

	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	@RequestMapping(value="/orders", method=RequestMethod.POST)
	public Order addOrder(@RequestBody Order order) {
		
		System.out.println("Customer Id: " + order.getCustomerId());
		List<Item> items = order.getItems();
		
		double priceSum = 0.0;
		int numOfItems = 0;
		for(Item item: items) {
			String productId = item.getProductId();
			priceSum += (RestClient.getProduct(productId).getPrice() * item.getQuantity());
			numOfItems += item.getQuantity();
		}
		
//		order.setTotal(priceSum);
		System.out.println("Number of Items: " + numOfItems + ", Total Price: " + priceSum);
		
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setCustomerId(order.getCustomerId());
		orderDetail.setNumberOfItems(numOfItems);
		orderDetail.setTotalPrice(priceSum);
		orderDetailRepository.save(orderDetail);

		
		return order;
	}
}
