package com.spring.webservice.service;

import com.spring.webservice.model.CustomerDetails;

public class CustomerService {
	public CustomerDetails getCustomerDetails()
	{
		CustomerDetails cust= new CustomerDetails();
		cust.setCustAddr("12445 Austin ");
		cust.setCustAge(24);
		cust.setCustID(451654);
		cust.setCustMobile("254545845");
		cust.setCustName("Mallikarjun");
		return cust;
	}
}
