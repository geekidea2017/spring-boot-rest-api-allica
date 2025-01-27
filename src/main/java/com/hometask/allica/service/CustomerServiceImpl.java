package com.hometask.allica.service;

import com.hometask.allica.controller.CustomerController;
import com.hometask.allica.model.Customer;
import com.hometask.allica.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

	Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		logger.info("Customer name to be saved {}", customer.getFirstName());
		return customerRepository.save(customer);
	}
	
	@Override
	public Customer getCustomerById(Long id) {
		logger.info("Customer id to fetch from DB {}", id);
		Optional<Customer> customer = customerRepository.findById(id);
		if(customer.isPresent()) return customer.get();
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		logger.info("get All customer");
		List<Customer> customers = new ArrayList<Customer>();
		customerRepository.findAll().forEach(customer -> customers.add(customer));
		return customers;
	}
}
