package com.ecommerce.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.app.model.Cart;
import com.ecommerce.app.model.Customer;

public interface CartRepo extends JpaRepository<Cart, Integer>{
	
	public Cart findByCustomer(Customer customer);
	
	@Query("select c from Cart c where c.customer.customerId=?1")
	public Cart getCart(Integer custId);

}
