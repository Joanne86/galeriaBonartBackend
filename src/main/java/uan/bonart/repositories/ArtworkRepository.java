package uan.bonart.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Artwork;

public interface ArtworkRepository extends CrudRepository<Artwork, Integer> {
    @Query("SELECT a FROM Artwork a where a.name = ?1")
    Artwork findByName(String name);
    @Query ("SELECT a FROM Artwork a join a.room r where r.code=?1")
    Iterable<Artwork> findByRoomCode(Integer code);
}
