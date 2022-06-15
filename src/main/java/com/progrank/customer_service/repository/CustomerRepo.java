package com.progrank.customer_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.progrank.customer_service.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{

}
