package uan.bonart.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Artist;
import uan.bonart.entities.Artwork;

import java.util.List;
import java.util.Optional;

<<<<<<< HEAD
=======
public interface ArtistRepository extends CrudRepository<Artist, Integer> {
    Optional<Artist> findByDocument(String document);
>>>>>>> refs/remotes/origin/dev_john

<<<<<<< HEAD
public interface ArtistRepository extends CrudRepository<Artist, String> {
	/*
	List<Artist>findAll();
	void delete(Artist artist);*/
	
=======
    @Query ("SELECT a FROM Artist a")
    List<Artist> findAll();
>>>>>>> refs/remotes/origin/dev_john
}
