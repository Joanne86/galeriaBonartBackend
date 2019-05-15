package uan.bonart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uan.bonart.entities.ArtworkSaled;
import uan.bonart.service.IArtworkSaledService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping( "/artworksaled-api" )
public class ArtworkSaledController {

    @Autowired
    IArtworkSaledService artworkSaledService;

    @PostMapping("/create")
    public ResponseEntity<ArtworkSaled> create(@RequestBody ArtworkSaled artworkSaled) {
        return new ResponseEntity<>(artworkSaledService.create(artworkSaled), HttpStatus.OK);
    }
}
