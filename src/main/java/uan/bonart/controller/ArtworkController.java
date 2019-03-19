package uan.bonart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uan.bonart.entities.Artist;
import uan.bonart.entities.Artwork;
import uan.bonart.service.IArtworkService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping( "/artwork-api" )
public class ArtworkController {

    @Autowired
    IArtworkService artworkService;

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<Artwork>> findAll() {
        return new ResponseEntity<>(artworkService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Artwork> create(@RequestBody Artwork artwork) {
        System.out.println("etra aqui");
        return new ResponseEntity<>(artworkService.create(artwork), HttpStatus.OK);
    }

}
