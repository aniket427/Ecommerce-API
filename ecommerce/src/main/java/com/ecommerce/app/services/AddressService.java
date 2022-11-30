package com.ecommerce.app.services;

import java.util.List;

import com.ecommerce.app.exceptions.AddressException;
import com.ecommerce.app.exceptions.LoginException;
import com.ecommerce.app.model.Address;


public interface AddressService {

	public Address addAddress(Address add, String key)throws AddressException, LoginException;
	public Address updateAddress(Address add)throws AddressException;
	public Address removeAddress(Integer addressId)throws AddressException;
	public List<Address> viewAllAddress()throws AddressException;
	public Address viewAddress(Integer id)throws AddressException;
	
}
