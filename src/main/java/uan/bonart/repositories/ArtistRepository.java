package uan.bonart.repositories;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import uan.bonart.entities.Artist;
import java.util.Optional;

public interface ArtistRepository extends CrudRepository<Artist, String> {
    @Query("SELECT a FROM Artist a WHERE a.document=?1")
    Optional<Artist> findByDocument(String document);

    @Transactional
    @Modifying
    @Query ("DELETE FROM Artist a where a.document=?1")
    void deleteByDocument(String document);
}
