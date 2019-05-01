package uan.bonart.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Room;
import uan.bonart.entities.Seller;

public interface RoomRepository extends CrudRepository<Room, Integer> {
    @Query("SELECT r.code FROM Room r join r.seller s where s.document = ?1")
    Integer getCode(String document);
}
