package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import uan.bonart.entities.Artwork;
import uan.bonart.repositories.ArtworkRepository;
import uan.bonart.service.IArtworkService;

public class ArtworkService implements IArtworkService {
    @Autowired
    private ArtworkRepository artworkRepository;

	@Override
	public Artwork create(Artwork artist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Artwork> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
