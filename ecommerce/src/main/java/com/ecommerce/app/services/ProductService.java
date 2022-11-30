package com.ecommerce.app.services;

import java.util.List;

import com.ecommerce.app.exceptions.ProductException;
import com.ecommerce.app.model.Product;

public interface ProductService {
	
	public List<Product> viewAllProducts() throws ProductException;	
	public Product addProduct(Product product) throws ProductException;
	public Product updateProduct(Product product) throws ProductException;
	public Product viewProduct(Integer id) throws ProductException;
	public List<Product> viewProductByCategory(String cname) throws ProductException;
	public Product removeProduct(Integer pid)throws ProductException;

}
