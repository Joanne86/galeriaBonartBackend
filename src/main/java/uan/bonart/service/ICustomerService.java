package uan.bonart.service;

import uan.bonart.entities.Customer;
import uan.bonart.exception.ResourceNotFoundException;

import java.util.List;

public interface ICustomerService {
	Customer create (Customer customer);

<<<<<<< HEAD
	Iterable<Customer> findAll();
	
	void delete (Customer customer) throws ResourceNotFoundException;
	
	Customer update(Customer customer) throws ResourceNotFoundException;
	
	Customer findById(String id) throws ResourceNotFoundException;
	
	void deleteById(String id) throws ResourceNotFoundException;
=======
    List<Customer> findAll();

    boolean findByDocument(String document);
>>>>>>> refs/remotes/origin/dev_john
}
