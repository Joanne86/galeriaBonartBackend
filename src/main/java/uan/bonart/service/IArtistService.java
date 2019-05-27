package uan.bonart.service;

import uan.bonart.entities.Artist;
import uan.bonart.exception.ResourceNotFoundException;

import java.util.Optional;


public interface IArtistService {
	Artist create (Artist artist);

	Iterable<Artist> findAll();

	void delete (String document) throws ResourceNotFoundException;

	Artist update(Artist artist) throws ResourceNotFoundException;

	boolean findByDocument(String document);

	Optional<Artist> findByDocument_(String document);

}
