package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uan.bonart.entities.Artwork;
import uan.bonart.repositories.ArtworkRepository;
import uan.bonart.service.IArtworkService;

@Service
public class ArtworkService implements IArtworkService {
    @Autowired
    private ArtworkRepository artworkRepository;

	@Override
	public Artwork create(Artwork artwork) {
		return artworkRepository.save(artwork);
	}

	@Override
	public Iterable<Artwork> findAll() {

		return artworkRepository.findAll();
	}

}
