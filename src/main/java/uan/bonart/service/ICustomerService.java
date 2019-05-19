package uan.bonart.service;


import uan.bonart.entities.Customer;

import java.util.List;

public interface ICustomerService {
    Customer create (Customer customer);

    List<Customer> findAll();

    boolean findByDocument(String document);
}
