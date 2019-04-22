package uan.bonart.service;

import uan.bonart.entities.Room;

public interface IRoomService {
    Room create (Room room);

    Iterable<Room> findAll();
}
