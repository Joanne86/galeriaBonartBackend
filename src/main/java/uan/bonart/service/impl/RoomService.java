package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uan.bonart.entities.Room;
import uan.bonart.repositories.RoomRepository;
import uan.bonart.service.IRoomService;

@Service
public class RoomService implements IRoomService {

    @Autowired
    RoomRepository roomRepository;

    @Override
    public Room create(Room room) {
        room.getCode();
        room.getName();
      //  room.getSeller().getDocument();
        return roomRepository.save(room);
    }

    @Override
    public Iterable<Room> findAll() {
        return roomRepository.findAll();
    }
}
