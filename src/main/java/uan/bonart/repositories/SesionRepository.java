package uan.bonart.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import uan.bonart.dto.LoginDto;
import uan.bonart.entities.Sesion;

public interface SesionRepository extends CrudRepository<Sesion, Integer> {
    @Query("SELECT s FROM Sesion s where s.user = ?1 and s.password = ?2")
    Sesion getSesion(String username, String password);
}
