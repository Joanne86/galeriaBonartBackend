package uan.bonart.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Customer;


public interface CustomerRepository extends CrudRepository<Customer, String> {

	Optional<Customer> findByDocument(String document);

    
}
