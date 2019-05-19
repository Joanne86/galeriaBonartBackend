package uan.bonart.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import uan.bonart.entities.ArtworkSaled;

public interface ArtworkSaledRepository extends CrudRepository<ArtworkSaled,Integer> {

    @Query ("SELECT a FROM ArtworkSaled a WHERE a.number_room=?1")
    Iterable<ArtworkSaled> findAllByNumber_room(int number_room);

    @Query ("SELECT SUM(a.price) FROM ArtworkSaled a WHERE a.number_room=?1")
    float getTotal(int number_room);
}
