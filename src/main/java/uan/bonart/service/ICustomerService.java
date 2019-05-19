package uan.bonart.service;

import java.util.List;

import uan.bonart.entities.Customer;
import uan.bonart.exception.ResourceNotFoundException;


public interface ICustomerService {
	Customer create (Customer customer);

	List<Customer> findAll();
	//Iterable<Customer> findAll();
	
	void delete (Customer customer) throws ResourceNotFoundException;
	
	Customer update(Customer customer) throws ResourceNotFoundException;
	
	Customer findById(String id) throws ResourceNotFoundException;
	
	void deleteById(String id) throws ResourceNotFoundException;
	
	boolean findByDocument(String document);


}
