package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import uan.bonart.repositories.ArtworkRepository;
import uan.bonart.service.IArtworkService;

public class ArtworkService implements IArtworkService {
    @Autowired
    private ArtworkRepository artworkRepository;

}
