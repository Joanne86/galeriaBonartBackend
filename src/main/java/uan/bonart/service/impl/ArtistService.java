package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import uan.bonart.repositories.ArtistRepository;
import uan.bonart.service.IArtistService;

public class ArtistService implements IArtistService {
    @Autowired
    private ArtistRepository artistRepository;

}
