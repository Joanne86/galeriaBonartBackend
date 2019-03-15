package uan.bonart.service;

import uan.bonart.bean.Sesion;
import uan.bonart.exception.ResourceNotFoundException;

public interface IUserService {
	//User create(User user);

    //void delete(User user) throws ResourceNotFoundException;
    
    void deleteById(int id) throws ResourceNotFoundException;
    
    /*Iterable<User> findAllByIdsesion(int idsesion);

    Iterable<User> findAll();

    /*User findById(int id) throws ResourceNotFoundException;
    
    User update(User user) throws ResourceNotFoundException;*/
    Sesion getSesion(String username, String password);
}
