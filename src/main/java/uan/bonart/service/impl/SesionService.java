package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uan.bonart.dto.LoginDto;
import uan.bonart.entities.Sesion;
import uan.bonart.repositories.SesionRepository;
import uan.bonart.service.ISesionService;

@Service
public class SesionService implements ISesionService {
    @Autowired
    SesionRepository sesionRepository;
    //Sesion sesion;

    LoginDto loginDto;

    @Override
    public Sesion getSesion(String username, String password) {
         return sesionRepository.getSesion(username,password);
        /* loginDto = new LoginDto(sesion.getSeller().getDocument(),
                 sesion.getSeller().getName(),sesion.getSeller().getCellphone(),
                 sesion.getUser(), sesion.getPassword());
         return loginDto;*/
    }
}
