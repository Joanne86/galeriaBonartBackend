package uan.bonart.repositories;

import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Artist;
import uan.bonart.entities.Artwork;

import java.util.Optional;

public interface ArtistRepository extends CrudRepository<Artist, Integer> {
    Optional<Artist> findByDocument(String document);
}
