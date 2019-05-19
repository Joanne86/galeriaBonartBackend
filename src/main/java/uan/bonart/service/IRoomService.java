package uan.bonart.service;

import uan.bonart.entities.Room;
import uan.bonart.entities.Seller;

import java.util.List;

public interface IRoomService {
    Room create (Room room);
    List<Room> findAll();
    Room getCode(String document);
}
