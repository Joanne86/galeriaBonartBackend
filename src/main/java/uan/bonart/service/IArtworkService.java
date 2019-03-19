package uan.bonart.service;

import uan.bonart.entities.Artwork;

public interface IArtworkService {

    Artwork create (Artwork artist);

    Iterable<Artwork> findAll();
}
