package uan.bonart.repositories;

import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Artist;


public interface ArtistRepository extends CrudRepository<Artist, String> {
	/*
	List<Artist>findAll();
	void delete(Artist artist);*/
	
}
