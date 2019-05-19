package uan.bonart.service;

import uan.bonart.entities.Artwork;

import java.util.List;
import java.util.Optional;

public interface IArtworkService {

    Artwork create (Artwork artwork);

    List<Artwork> findAll();

    Artwork findByName (String name);

    List<Artwork> findByRoomCode(Integer code);

    void deleteByInscription_code(int code);

    Optional<Artwork> findByInscription_code(int inscription_code);
}
