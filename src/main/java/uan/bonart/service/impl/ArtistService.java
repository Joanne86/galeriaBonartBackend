package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uan.bonart.entities.Artist;
import uan.bonart.repositories.ArtistRepository;
import uan.bonart.service.IArtistService;

@Service
public class ArtistService implements IArtistService {
    @Autowired
    private ArtistRepository artistRepository;

	@Override
	public Artist create(Artist artist) {		
		return artistRepository.save(artist);
	}
	
	@Override
	public Iterable<Artist> findAll() {
		return artistRepository.findAll();
	}



}
