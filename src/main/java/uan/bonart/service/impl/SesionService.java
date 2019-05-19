package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uan.bonart.entities.Sesion;
import uan.bonart.repositories.SesionRepository;
import uan.bonart.service.ISesionService;

@Service
public class SesionService implements ISesionService {

    @Autowired
    SesionRepository sesionRepository;

    @Override
    public Sesion getSesion(String username, String password) {
         return sesionRepository.getSesion(username,password);
    }
}
