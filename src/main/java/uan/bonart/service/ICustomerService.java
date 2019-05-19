package uan.bonart.service;

import uan.bonart.entities.Customer;
import uan.bonart.exception.ResourceNotFoundException;


public interface ICustomerService {
	Customer create (Customer customer);


	Iterable<Customer> findAll();
	
	void delete (Customer customer) throws ResourceNotFoundException;
	
	Customer update(Customer customer) throws ResourceNotFoundException;
	
	Customer findById(String id) throws ResourceNotFoundException;
	
	void deleteById(String id) throws ResourceNotFoundException;


}
