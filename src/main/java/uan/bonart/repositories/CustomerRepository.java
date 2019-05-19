package uan.bonart.repositories;

import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Customer;

<<<<<<< HEAD
public interface CustomerRepository extends CrudRepository<Customer, String> {
=======
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Optional<Customer> findByDocument(String document);
>>>>>>> refs/remotes/origin/dev_john
    //query de tener el monto actual en cualquier momento se puede consultar cuando se llega recaudado
}
