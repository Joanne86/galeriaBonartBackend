package uan.bonart.repositories;

import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Customer;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Optional<Customer> findByDocument(String document);
    //query de tener el monto actual en cualquier momento se puede consultar cuando se llega recaudado
}
