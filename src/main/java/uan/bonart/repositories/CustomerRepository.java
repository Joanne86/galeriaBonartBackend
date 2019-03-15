package uan.bonart.repositories;

import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    //query de tener el monto actual en cualquier momento se puede consultar cuando se llega recaudado
}
