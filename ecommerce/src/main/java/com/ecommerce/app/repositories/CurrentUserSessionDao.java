package com.ecommerce.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.app.model.CurrentUserSession;


public interface CurrentUserSessionDao extends JpaRepository<CurrentUserSession, Integer>  {

	public Optional<CurrentUserSession> findByCustomerId(Integer customerId) ;
	
	public Optional<CurrentUserSession> findByUuid(String uuid) ;
	
}
