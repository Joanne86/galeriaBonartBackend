package uan.bonart.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Artwork;

public interface ArtworkRepository extends CrudRepository<Artwork, Integer> {
    @Query("SELECT a FROM Artwork a where a.artwork_type = ?1")
    Artwork findByAndArtwork_type(String name);
}
