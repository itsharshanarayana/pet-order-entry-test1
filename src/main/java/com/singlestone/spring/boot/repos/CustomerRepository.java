package com.singlestone.spring.boot.repos;

import org.springframework.data.repository.CrudRepository;

import com.singlestone.spring.boot.model.Customer;


public interface CustomerRepository extends CrudRepository<Customer, String> {

	Customer findByCustomerId(String customerId);
	
}
