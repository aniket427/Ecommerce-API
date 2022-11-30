package com.ecommerce.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.app.exceptions.ProductException;
import com.ecommerce.app.model.Product;
import com.ecommerce.app.services.ProductService;


@RestController
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @PostMapping("/products")
    public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product ) throws ProductException{
    	
    	Product addedProduct = productService.addProduct(product);
    	
    	return new ResponseEntity<Product>(addedProduct, HttpStatus.CREATED);
    	
    }
    
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() throws ProductException{
    	
    	List<Product> allProducts = productService.viewAllProducts();
    	
    	return new ResponseEntity<List<Product>>(allProducts, HttpStatus.OK);
    	
    }
    
    @PutMapping("/products")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product) throws ProductException{
    	
    	Product updatedProduct = productService.updateProduct(product);
    	
    	return new ResponseEntity<Product>(updatedProduct, HttpStatus.ACCEPTED);
    	
    }
    
    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable("productId") Integer productId) throws ProductException{
    	
    	Product exixtingProduct = productService.viewProduct(productId);
    	
    	return new ResponseEntity<Product>(exixtingProduct, HttpStatus.OK);
    	
    }
    
    @GetMapping("/products/category/{categoryName}")
    public ResponseEntity<List<Product>> getProductByCategory(@PathVariable("categoryName") String categoryName) throws ProductException{
    	
    	List<Product> categorywiseProducts = productService.viewProductByCategory(categoryName);
    	
    	return new ResponseEntity<List<Product>>(categorywiseProducts, HttpStatus.OK);
    	
    }
    
    
    @DeleteMapping("/products/{productId}")
    public ResponseEntity<Product> deleteProduct(@PathVariable("productId") Integer productId) throws ProductException{
    	
    	Product deletedProduct = productService.removeProduct(productId);
    	
    	return new ResponseEntity<Product>(deletedProduct, HttpStatus.OK);
    	
    }
}
