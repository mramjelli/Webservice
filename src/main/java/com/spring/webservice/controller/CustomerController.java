package com.spring.webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.webservice.model.CustomerDetails;
import com.spring.webservice.service.CustomerService;

@RestController
public class CustomerController {
@GetMapping("/getCustomerDetails")
public CustomerDetails getCustomerDetails() {
	CustomerService cust1=new CustomerService();
	CustomerDetails cud = cust1.getCustomerDetails();
	return cud;
}
}
