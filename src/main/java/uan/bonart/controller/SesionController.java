package uan.bonart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uan.bonart.dto.LoginDto;
import uan.bonart.entities.Sesion;
import uan.bonart.exception.ResourceNotFoundException;
import uan.bonart.service.ISesionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping( "/sesion-api" )
public class SesionController {
    @Autowired
    ISesionService sesionService;

    @GetMapping("/getSesion")
    public ResponseEntity<LoginDto> getSesion(@RequestParam String username, @RequestParam String password) throws ResourceNotFoundException {
        Sesion sesion = sesionService.getSesion(username, password);
        if(sesion==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            LoginDto loginDto = new LoginDto(sesion.getSeller().getDocument(),
                    sesion.getSeller().getName(), sesion.getSeller().getCellphone(),
                    sesion.getUser(), sesion.getPassword());
            return new ResponseEntity<>(loginDto, HttpStatus.OK);
        }
    }
}
