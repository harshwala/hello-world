package com.progrank.customer_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progrank.customer_service.entity.Customer;
import com.progrank.customer_service.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public Customer saveCust(Customer c) {
		return customerRepo.save(c);
	}

}
