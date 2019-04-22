package uan.bonart.repositories;

import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Room;

public interface RoomRepository extends CrudRepository<Room, Integer> {
}
