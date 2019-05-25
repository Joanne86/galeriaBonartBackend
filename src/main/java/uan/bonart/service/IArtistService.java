package uan.bonart.service;

import uan.bonart.entities.Artist;
import uan.bonart.exception.ResourceNotFoundException;


public interface IArtistService {
	Artist create (Artist artist);

	Iterable<Artist> findAll();

	void delete (Artist artist) throws ResourceNotFoundException;

	Artist update(Artist artist) throws ResourceNotFoundException;

	boolean findByDocument(String document);

}
