package uan.bonart.service;

import uan.bonart.entities.Room;
import uan.bonart.entities.Seller;

public interface IRoomService {
    Room create (Room room);

    Iterable<Room> findAll();
    Room getCode(String document);
}
