package com.hometask.allica.service;

import com.hometask.allica.model.Customer;

import java.util.List;


public interface CustomerService {
	
	List<Customer> getAllCustomer();
	Customer getCustomerById(Long id);
	Customer saveCustomer(Customer customer);
}
