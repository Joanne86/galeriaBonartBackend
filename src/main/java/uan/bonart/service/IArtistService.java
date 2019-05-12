package uan.bonart.service;

import org.springframework.web.bind.annotation.RequestParam;
import uan.bonart.entities.Artist;

import java.util.Optional;

public interface IArtistService {
	Artist create (Artist artist);

	Iterable<Artist> findAll();
	boolean findByDocument(String document);

}
