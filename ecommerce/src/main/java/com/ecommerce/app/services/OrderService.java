package com.ecommerce.app.services;

import java.time.LocalDate;
import java.util.List;

import com.ecommerce.app.exceptions.AddressException;
import com.ecommerce.app.exceptions.CartException;
import com.ecommerce.app.exceptions.LoginException;
import com.ecommerce.app.exceptions.OrderException;
import com.ecommerce.app.model.Orders;


public interface OrderService {

	
		public Orders addOrder(Orders order, String key) throws OrderException, CartException, LoginException;
		public Orders updateOrder(Orders order, String key) throws OrderException, LoginException;
		public Orders removeOrder(Integer oriderId, String key) throws OrderException;
		public Orders viewOrder(Integer orderId) throws OrderException;
		public List<Orders> viewAllOrdersByDate(LocalDate date) throws OrderException;
		public List<Orders> viewAllOrdersByLocation(String city) throws OrderException, AddressException;
		public List<Orders> viewAllOrdersByUserId(String userid) throws OrderException;

	
}
