package uan.bonart.repositories;

import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Seller;

public interface SellerRepository extends CrudRepository<Seller, Integer> {
}
