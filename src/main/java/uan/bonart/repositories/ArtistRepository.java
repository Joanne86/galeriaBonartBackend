package uan.bonart.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Artist;
import java.util.Optional;


public interface ArtistRepository extends CrudRepository<Artist, Integer> {

    @Query("SELECT a FROM Artist a WHERE a.document=?1")
	Optional<Artist> findByDocument(String document);

}
