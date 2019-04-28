package uan.bonart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<Sesion> getSesion(@RequestParam String username, @RequestParam String password) throws ResourceNotFoundException {
        return new ResponseEntity<>(sesionService.getSesion(username, password), HttpStatus.OK);
    }
}
