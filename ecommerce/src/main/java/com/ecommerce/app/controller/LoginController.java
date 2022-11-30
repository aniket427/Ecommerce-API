package com.ecommerce.app.controller;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.app.exceptions.CustomerException;
import com.ecommerce.app.exceptions.LoginException;
import com.ecommerce.app.exceptions.UserException;
import com.ecommerce.app.model.CurrentUserSession;
import com.ecommerce.app.model.User;
import com.ecommerce.app.services.LoginService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class LoginController {
	
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/login")
	public ResponseEntity<CurrentUserSession> addUser(@Valid @RequestBody User user) throws UserException, CustomerException {

		CurrentUserSession currentSession = loginService.addUser(user);
				
		return new ResponseEntity<CurrentUserSession>(currentSession,HttpStatus.CREATED) ;
	}
	
	@DeleteMapping("/logout")
	public ResponseEntity<String> logoutUser(@RequestParam String key) throws UserException, LoginException {

		String response = loginService.signOut(key);
		
		return new ResponseEntity<String>(response,HttpStatus.OK) ;
		
	}
	
	
}












