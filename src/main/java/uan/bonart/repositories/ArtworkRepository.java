package uan.bonart.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.Artwork;

public interface ArtworkRepository extends CrudRepository<Artwork, Integer> {

    @Query ("SELECT a FROM Artwork a join a.room r where r.code=?1")
    Iterable<Artwork> findByRoomCode(Integer code);
    Artwork findByName(String name);
    @Query ("DELETE FROM Artwork a where a.inscription_code=?1")
    void deleteByInscription_code(int inscription_code);

    //Artwork findByInscription_code(int inscription_code);
}
