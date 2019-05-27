package uan.bonart.service;

import uan.bonart.entities.ArtworkSaled;

import java.util.List;

public interface IArtworkSaledService {

    ArtworkSaled create (ArtworkSaled artworkSaled);

    List<ArtworkSaled> findAllByNumber_room(int number_room);

    List<ArtworkSaled> findAll();

    float getTotal(int number_room);

    float getTotals();

}
