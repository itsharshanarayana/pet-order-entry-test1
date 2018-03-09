package com.singlestone.spring.boot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.singlestone.spring.boot.model.Customer;
import com.singlestone.spring.boot.repos.CustomerRepository;


@Service
public class CustomerService {

	private CustomerRepository customerRepository;
//	private List<Customer> customers;
	
	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public List<Customer> getCustomers(){
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}
	
	public Customer getCustomer(String customerId) {
		return customerRepository.findByCustomerId(customerId);
	}
	
	
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void deleteCustomer(String customerId) {
		customerRepository.deleteById(customerId);
	}

}
