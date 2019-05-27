package uan.bonart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uan.bonart.entities.ArtworkSaled;
import uan.bonart.service.IArtworkSaledService;

import java.util.List;

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
    @GetMapping("/findAllByNumberRoom")
    public ResponseEntity<List<ArtworkSaled>> findAllByNumber_room(@RequestParam int number_room) {
        return new ResponseEntity(artworkSaledService.findAllByNumber_room(number_room), HttpStatus.OK);
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<ArtworkSaled>> findAll() {
        return new ResponseEntity(artworkSaledService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/getTotal")
    public float getTotal(@RequestParam int number_room) {
        return (artworkSaledService.getTotal(number_room));
    }

    @GetMapping("/getTotals")
    public float getTotales() {
        return (artworkSaledService.getTotals());
    }

}
