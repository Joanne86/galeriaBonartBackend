package uan.bonart.repositories;

import org.springframework.data.repository.CrudRepository;

import uan.bonart.entities.Seller;


public interface UserRepository extends CrudRepository<Seller, Integer> {
	/*@Query ("SELECT u FROM User u where u.sesion.id = ?1")
	//u.name, u.phone, u.email, u.id, u.address, u.description, u.sesion.id
	Iterable<User> findAllByIdsesion(int idsesion);
	
	@Query ("SELECT s FROM Sesion s where s.user = ?1 and s.password = ?2")
	Sesion getSesion(String username, String password);*/
}
