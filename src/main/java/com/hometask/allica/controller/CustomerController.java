package com.hometask.allica.controller;

import com.hometask.allica.model.Customer;
import com.hometask.allica.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

	Logger logger = LoggerFactory.getLogger(CustomerController.class);


	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		logger.info("Post call Customer name {}", customer.getFirstName());
		return customerService.saveCustomer(customer);
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable("id") Long id) {
		logger.info("Get call Customer id {}", id);
		return customerService.getCustomerById(id);
	}
	
	@GetMapping("/customer")
	public List<Customer> getAllCustomer(){
		logger.info("Get All Customer ");
	 	return customerService.getAllCustomer();
	}

}
