package uan.bonart.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import uan.bonart.entities.Artwork;

import java.util.List;
import java.util.Optional;

public interface ArtworkRepository extends CrudRepository<Artwork, Integer> {

    @Query ("SELECT a FROM Artwork a join a.room r where r.code=?1")
    List<Artwork> findByRoomCode(Integer code);
    Artwork findByName(String name);

    @Transactional
    @Modifying
    @Query ("DELETE FROM Artwork a where a.inscription_code=?1")
    void deleteByInscription_code(int inscription_code);

    @Query ("SELECT a FROM Artwork a where a.inscription_code=?1")
    Optional<Artwork> findByInscription_code(int inscription_code);
}
