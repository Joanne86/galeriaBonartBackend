package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uan.bonart.entities.ArtworkSaled;
import uan.bonart.repositories.ArtworkSaledRepository;
import uan.bonart.service.IArtworkSaledService;

@Service
public class ArtworkSaledService implements IArtworkSaledService {

    @Autowired
    ArtworkSaledRepository artworkSaledRepository;


    @Override
    public ArtworkSaled create(ArtworkSaled artworkSaled) {
        return artworkSaledRepository.save(artworkSaled);
    }

    @Override
    public Iterable<ArtworkSaled> findAllByNumber_room(int number_room) {
        return artworkSaledRepository.findAllByNumber_room(number_room);
    }

    @Override
    public float getTotal(int number_room) {
       return artworkSaledRepository.getTotal(number_room);
    }
}
