package uan.bonart.service;

import uan.bonart.entities.Artist;
import uan.bonart.entities.Artwork;
import uan.bonart.entities.Room;
import uan.bonart.entities.Sesion;
import uan.bonart.exception.ResourceNotFoundException;

public interface IUserService {

    Iterable<Artist> findAll();

    Iterable<Artwork> findAllArtwork();

    Room create (Room room);

    void deleteById(int id) throws ResourceNotFoundException;

    Sesion getSesion(String username, String password);

    Artist create (Artist artist);



	//User create(User user);

    //void delete(User user) throws ResourceNotFoundException;
    

    
    /*Iterable<User> findAllByIdsesion(int idsesion);

    Iterable<User> findAll();

    /*User findById(int id) throws ResourceNotFoundException;
    
    User update(User user) throws ResourceNotFoundException;*/

}
