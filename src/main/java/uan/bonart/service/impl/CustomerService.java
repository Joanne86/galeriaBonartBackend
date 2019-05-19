package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uan.bonart.entities.Customer;
import uan.bonart.exception.ResourceNotFoundException;
import uan.bonart.repositories.CustomerRepository;
import uan.bonart.service.ICustomerService;

import java.util.List;


@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;

	@Override
	public Customer create(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
<<<<<<< HEAD
	public Iterable<Customer> findAll() {
		return customerRepository.findAll();
=======
	public List<Customer> findAll() {
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public boolean findByDocument(String document) {
		return customerRepository.findByDocument(document).isPresent();
>>>>>>> refs/remotes/origin/dev_john
	}

	@Override
	public void delete(Customer customer) throws ResourceNotFoundException {
		if(customerRepository.findById(customer.getDocument()).isPresent())
			customerRepository.delete(customer);
		throw new ResourceNotFoundException("Customer", "document", customer.getDocument());
		
	}

	@Override
	public Customer update(Customer customer) throws ResourceNotFoundException {
		if(customerRepository.findById(customer.getDocument()).isPresent())
			return customerRepository.save(customer);
		throw new ResourceNotFoundException("Customer", "document", customer.getDocument());
	}

	@Override
	public Customer findById(String id) throws ResourceNotFoundException {
		if(customerRepository.findById(id).isPresent())
			return customerRepository.findById(id).get();
		
		throw new ResourceNotFoundException("Customer", "document", id);
	}

	@Override
	public void deleteById(String id) throws ResourceNotFoundException {
		if(customerRepository.findById(id).isPresent())
			customerRepository.deleteById(id);
		
		throw new ResourceNotFoundException("Customer", "document", id);
		
	}

	

   

}
