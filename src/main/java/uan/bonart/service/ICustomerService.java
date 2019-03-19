package uan.bonart.service;


import uan.bonart.entities.Customer;

public interface ICustomerService {
    Customer create (Customer customer);

    Iterable<Customer> findAll();
}
