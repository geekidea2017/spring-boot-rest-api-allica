package com.hometask.allica.service;

import com.hometask.allica.model.Customer;
import org.springframework.data.domain.Page;

import java.util.List;


public interface CustomerService {
	
	Page<Customer> getAllCustomer(int page, int size);
	Customer getCustomerById(Long id);
	Customer saveCustomer(Customer customer);
}
