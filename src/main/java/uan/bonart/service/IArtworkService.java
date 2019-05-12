package uan.bonart.service;

import uan.bonart.entities.Artwork;

import java.util.Optional;

public interface IArtworkService {

    Artwork create (Artwork artwork);

    Iterable<Artwork> findAll();

    Artwork findByName (String name);

    Iterable<Artwork> findByRoomCode(Integer code);

    void deleteByInscription_code(int code);

    Optional<Artwork> findByInscription_code(int inscription_code);
}
