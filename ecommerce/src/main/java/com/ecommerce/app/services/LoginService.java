package com.ecommerce.app.services;

import com.ecommerce.app.exceptions.CustomerException;
import com.ecommerce.app.exceptions.LoginException;
import com.ecommerce.app.exceptions.UserException;
import com.ecommerce.app.model.CurrentUserSession;
import com.ecommerce.app.model.User;

public interface LoginService {

	public CurrentUserSession addUser(User user) throws UserException, CustomerException ;
	
	public User removeUser(User user,String key) throws UserException ;
	
	public User validateUser(User user,String key) throws UserException, LoginException ;
	
	public String signOut(String key) throws UserException, LoginException ;
	
}
