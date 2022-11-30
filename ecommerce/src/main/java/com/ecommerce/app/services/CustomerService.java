package com.ecommerce.app.services;



import java.util.List;

import com.ecommerce.app.exceptions.CustomerException;
import com.ecommerce.app.exceptions.LoginException;
import com.ecommerce.app.model.Customer;

public interface CustomerService {

	public Customer addCustomer(Customer cust) throws CustomerException ;
	
	public Customer updateCustomer(Customer cust, String key) throws CustomerException, LoginException;
	
	public Customer removeCustomer(Customer cust, String key) throws CustomerException, LoginException;
	
	public Customer viewCustomer(Integer customerId)  throws CustomerException;

	public List<Customer> viewAllCustomer() throws CustomerException;
	
	
}
