package uan.bonart.service;

import org.springframework.web.bind.annotation.RequestParam;
import uan.bonart.entities.Artist;
import uan.bonart.exception.ResourceNotFoundException;

import java.util.Optional;

public interface IArtistService {
	Artist create (Artist artist);

	Iterable<Artist> findAll();
<<<<<<< HEAD
	
	void delete (Artist artist) throws ResourceNotFoundException;
	
	Artist update(Artist artist) throws ResourceNotFoundException;
	
	Artist findById(String id) throws ResourceNotFoundException;
	
	void deleteById(String id) throws ResourceNotFoundException;
	
=======
	boolean findByDocument(String document);

>>>>>>> refs/remotes/origin/dev_john
}
