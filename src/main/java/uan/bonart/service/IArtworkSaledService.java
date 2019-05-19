package uan.bonart.service;

import uan.bonart.entities.ArtworkSaled;

public interface IArtworkSaledService {

    ArtworkSaled create (ArtworkSaled artworkSaled);

    Iterable<ArtworkSaled> findAllByNumber_room(int number_room);

    float getTotal(int number_room);

}
