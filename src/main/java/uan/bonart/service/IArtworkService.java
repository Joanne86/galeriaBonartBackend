package uan.bonart.service;

import uan.bonart.entities.Artwork;

public interface IArtworkService {

    Artwork create (Artwork artwork);

    Iterable<Artwork> findAll();

    Artwork findByName (String name);

    Iterable<Artwork> findByRoomCode(Integer code);

    void deleteByInscription_code(int code);
}
