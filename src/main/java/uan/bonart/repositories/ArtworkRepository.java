package uan.bonart.repositories;

import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Artist;

public interface ArtworkRepository extends CrudRepository<Artist, Integer> {
}
