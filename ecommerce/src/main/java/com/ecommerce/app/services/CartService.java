package com.ecommerce.app.services;

import java.util.List;

import com.ecommerce.app.exceptions.CartException;
import com.ecommerce.app.exceptions.LoginException;
import com.ecommerce.app.exceptions.ProductException;
import com.ecommerce.app.model.Cart;
import com.ecommerce.app.model.ProductDto;


public interface CartService {

	public Cart addProductToCart(Integer productId, int quantity,String key) throws CartException, LoginException, ProductException;
	
	public List<ProductDto> removeProductFromCart(Integer productId,String key) throws CartException, ProductException, LoginException ;
	
	public List<ProductDto> updateProductQuantity(Integer productId,Integer quantity,String key) throws CartException, LoginException, ProductException;
	
	public Cart removeAllProducts(String key) throws CartException, LoginException;
	
	public List<ProductDto> viewAllProducts(String key)  throws CartException, LoginException;
 
	

}
