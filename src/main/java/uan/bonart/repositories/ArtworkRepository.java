package uan.bonart.repositories;

import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Artwork;

public interface ArtworkRepository extends CrudRepository<Artwork, Integer> {
}
