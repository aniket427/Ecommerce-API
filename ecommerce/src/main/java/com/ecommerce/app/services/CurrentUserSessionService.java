package com.ecommerce.app.services;

import com.ecommerce.app.exceptions.LoginException;
import com.ecommerce.app.model.CurrentUserSession;
import com.ecommerce.app.model.Customer;

public interface CurrentUserSessionService {

	public CurrentUserSession getCurrentUserSession(String key) throws LoginException;
	
	public Integer getCurrentUserCustomerId(String key) throws LoginException;
	
	public Customer getCustomerDetails(String key) throws LoginException;
	
}
