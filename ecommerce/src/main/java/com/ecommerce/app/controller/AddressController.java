package com.ecommerce.app.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.app.exceptions.AddressException;
import com.ecommerce.app.exceptions.LoginException;
import com.ecommerce.app.model.Address;
import com.ecommerce.app.services.AddressService;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/address")
    public ResponseEntity<Address> addAddress(@Valid @RequestBody Address address ,@RequestParam String key) throws AddressException, LoginException {

        Address addAddresses = addressService.addAddress(address, key);


        return new ResponseEntity<Address>(addAddresses, HttpStatus.OK);

    }
    @PutMapping("/address")
    public ResponseEntity<Address> updateProduct(@RequestBody Address address) throws AddressException{

        Address updateAddress = addressService.updateAddress(address);

        return new ResponseEntity<Address>(updateAddress, HttpStatus.ACCEPTED);

    }

    @DeleteMapping("/address/{addressId}")
    public ResponseEntity<Address> deleteAddress(@PathVariable("addressId") Integer addressId) throws AddressException{

        Address deleteAddress = addressService.removeAddress(addressId);

        return new ResponseEntity<Address>(deleteAddress, HttpStatus.OK);

    }
    @GetMapping("/getalladdress")
    public ResponseEntity<List<Address>> getAllAddress() throws AddressException{

        List<Address> allAddress = addressService.viewAllAddress();

        return new ResponseEntity<List<Address>>(allAddress, HttpStatus.OK);

    }

    @GetMapping("/getaddress/{addressId}")
    public ResponseEntity<Address> getAddress(@PathVariable("addressId") Integer addressId) throws AddressException{

        Address existingAddress = addressService.viewAddress(addressId);

        return new ResponseEntity<Address>(existingAddress, HttpStatus.OK);

    }

}