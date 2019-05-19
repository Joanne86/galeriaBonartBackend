package uan.bonart.service;


import uan.bonart.entities.Customer;

import java.util.Optional;

public interface ICustomerService {
    Customer create (Customer customer);

    Iterable<Customer> findAll();

    boolean findByDocument(String document);
}
