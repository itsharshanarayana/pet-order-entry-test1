package com.singlestone.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.singlestone.spring.boot.model.OrderDetail;
import com.singlestone.spring.boot.repos.OrderDetailRepository;

@Service
public class OrderDetailService {
	
	private OrderDetailRepository orderDetailRepository;
	
	@Autowired
	public OrderDetailService(OrderDetailRepository orderDetailRepository) {
		this.orderDetailRepository = orderDetailRepository;
	}
	
	public List<OrderDetail> getOrderDetails(){
		return (List<OrderDetail>) orderDetailRepository.findAll();
	}

}
