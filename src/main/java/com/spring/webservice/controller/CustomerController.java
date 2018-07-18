package com.spring.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.webservice.model.CustomerDetails;
import com.spring.webservice.service.CustomerService;

@RestController
public class CustomerController {
@Autowired	
private CustomerService custser;
@GetMapping("/getCustomerDetails")
public CustomerDetails getCustomerDetails() {
	CustomerService cust1=new CustomerService();
	CustomerDetails cud = cust1.getCustomerDetails();
	return cud;
}
@GetMapping("/test")
public String test() {
	CustomerService cust1=new CustomerService();
	CustomerDetails cud = cust1.getCustomerDetails();
	return "Test class for spring";
}
@GetMapping("/getCustomerDetails2")
public CustomerDetails getCustomerDetails2() {
	//CustomerService cust1=new CustomerService();
	CustomerDetails cud = custser.getCustomerDetails();
	return cud;
}

}
