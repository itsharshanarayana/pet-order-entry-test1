package com.singlestone.spring.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.singlestone.spring.boot.model.Customer;
import com.singlestone.spring.boot.services.CustomerService;

@RestController
public class CustomerController{

	private CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@RequestMapping(value="/customers", method=RequestMethod.GET)
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}

	@RequestMapping(value="/customers/{customerId}", method=RequestMethod.GET)
	public Customer getCustomer(@PathVariable("customerId") String customerId) {
		return customerService.getCustomer(customerId);
	}

	@RequestMapping(value="/customers", method=RequestMethod.POST)
	public void addCustomer(@RequestBody Customer customer) {
		System.out.println(customer);
		customerService.addCustomer(customer);
	}

	@RequestMapping(value="/customers/{customerId}", method=RequestMethod.PUT)
	public void updateCustomer(@RequestBody Customer customer, @PathVariable("customerId") String customerId) {
		customerService.updateCustomer(customer);

	}

	@RequestMapping(value="/customers/{customerId}", method=RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable("customerId") String customerId) {
		customerService.deleteCustomer(customerId);
	}

}
