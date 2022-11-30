package com.ecommerce.app.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.app.exceptions.AddressException;
import com.ecommerce.app.model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{
	@Query("select a from Address a where a.state= ?1")
	public Address viewAddressByState(String state)throws AddressException;

}
