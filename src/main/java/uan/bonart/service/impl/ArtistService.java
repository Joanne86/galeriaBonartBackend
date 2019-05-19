package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uan.bonart.entities.Artist;
import uan.bonart.exception.ResourceNotFoundException;
import uan.bonart.repositories.ArtistRepository;
import uan.bonart.service.IArtistService;


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
	public void delete(Artist artist) throws ResourceNotFoundException {
		
		if (artistRepository.findById(artist.getDocument()).isPresent()) {
			artistRepository.delete(artist);
		}
		throw new ResourceNotFoundException("Artist", "document", artist.getDocument());
	}
	
	
	@Override
	public void deleteById(String id) throws ResourceNotFoundException {
		if (artistRepository.findById(id).isPresent()) {
			artistRepository.deleteById(id);
		} else {
			throw new ResourceNotFoundException("Artist", "document", id);
		}

	}

	@Override
	public Artist update(Artist artist) throws ResourceNotFoundException {
		
		if (artistRepository.findById(artist.getDocument()).isPresent()) {
			return artistRepository.save(artist);
		}
		throw new ResourceNotFoundException("Artist", "document", artist.getDocument());
		
	}

	@Override
	public Artist findById(String id) throws ResourceNotFoundException {
		if (artistRepository.findById(id).isPresent()) {
			return artistRepository.findById(id).get();
		} else {
			throw new ResourceNotFoundException("Artist", "document", id);
		}
	}
	@Override
	public boolean findByDocument(String document) {
		
		return(artistRepository.findByDocument(document).isPresent());
	}

}
