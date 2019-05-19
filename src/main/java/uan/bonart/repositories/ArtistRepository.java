package uan.bonart.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Artist;
import uan.bonart.entities.Artwork;

import java.util.List;
import java.util.Optional;


public interface ArtistRepository extends CrudRepository<Artist, String> {
	Optional<Artist> findByDocument(String document);

    @Query ("SELECT a FROM Artist a")
    List<Artist> findAll();
	
}
