package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uan.bonart.entities.Customer;
import uan.bonart.repositories.CustomerRepository;
import uan.bonart.service.ICustomerService;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;

	@Override
	public Customer create(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
