package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uan.bonart.entities.Customer;
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
	public List<Customer> findAll() {
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public boolean findByDocument(String document) {
		return customerRepository.findByDocument(document).isPresent();
	}

}
