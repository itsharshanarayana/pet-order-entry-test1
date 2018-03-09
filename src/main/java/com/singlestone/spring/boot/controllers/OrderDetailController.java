package com.singlestone.spring.boot.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.singlestone.spring.boot.model.OrderDetail;
import com.singlestone.spring.boot.services.OrderDetailService;

@RestController
public class OrderDetailController {

	private OrderDetailService orderDetailService;
	
	public OrderDetailController(OrderDetailService orderDetailService) {
		this.orderDetailService = orderDetailService;
	}
	
	@RequestMapping(value="/orderdetails", method=RequestMethod.GET)
	public List<OrderDetail> getOrderDetails(){
		return orderDetailService.getOrderDetails();
	}
}
