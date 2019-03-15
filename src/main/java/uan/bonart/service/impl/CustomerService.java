package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import uan.bonart.repositories.CustomerRepository;
import uan.bonart.service.ICustomerService;

public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;

}
