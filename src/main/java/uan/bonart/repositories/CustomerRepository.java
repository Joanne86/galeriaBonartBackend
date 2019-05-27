package uan.bonart.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Customer;


public interface CustomerRepository extends CrudRepository<Customer, String> {

	@Query("SELECT c FROM Customer c WHERE c.document=?1")
	Optional<Customer> findByDocument(String document);

	@Query("SELECT SUM(c.typeCustomer.price) FROM Customer c")
	float getTotal();
}
