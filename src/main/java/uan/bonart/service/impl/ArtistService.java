package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uan.bonart.entities.Artist;
import uan.bonart.exception.ResourceNotFoundException;
import uan.bonart.repositories.ArtistRepository;
import uan.bonart.service.IArtistService;

import java.util.Optional;


@Service

public class ArtistService implements IArtistService {
	@Autowired
	private ArtistRepository artistRepository;

	@Override
	public Artist create(Artist artist) {
		return artistRepository.save(artist); }
	@Override
	public Iterable<Artist> findAll() {
		return artistRepository.findAll(); }


	@Override
	public void delete(String document) throws ResourceNotFoundException {
		if (artistRepository.findByDocument(document).isPresent()) {
			artistRepository.deleteByDocument(document);
		}else{
			throw new ResourceNotFoundException("Artist", "document", document);
		}

	}

	@Override
	public Artist update(Artist artist) throws ResourceNotFoundException {
		if (artistRepository.findByDocument(artist.getDocument()).isPresent()) {
			return artistRepository.save(artist);
		}else{
			throw new ResourceNotFoundException("Artist", "document", artist.getDocument());
		}
	}

	@Override
	public boolean findByDocument(String document) {
		return(artistRepository.findByDocument(document).isPresent());
	}

	@Override
	public Optional<Artist> findByDocument_(String document) {
		return artistRepository.findByDocument(document);
	}

}
