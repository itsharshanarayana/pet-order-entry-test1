package com.singlestone.spring.boot.repos;

import org.springframework.data.repository.CrudRepository;

import com.singlestone.spring.boot.model.OrderDetail;

public interface OrderDetailRepository extends CrudRepository<OrderDetail, Long> {

}
