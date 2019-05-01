package uan.bonart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uan.bonart.dto.ArtworkDto;
import uan.bonart.entities.Artist;
import uan.bonart.entities.Artwork;
import uan.bonart.service.IArtworkService;

import java.util.ArrayList;
import java.util.List;

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
    @GetMapping("/findByName")
    public ResponseEntity<Artwork> findByName(@RequestParam String name) {
        return new ResponseEntity<>(artworkService.findByName(name), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Artwork> create(@RequestBody Artwork artwork) {
        return new ResponseEntity<>(artworkService.create(artwork), HttpStatus.OK);
    }
    @GetMapping("/findByRoomCode")
    public ResponseEntity<Iterable<ArtworkDto>> findByRoomCode(@RequestParam Integer code){
        Iterable<Artwork> artwork = artworkService.findByRoomCode(code);
        ArrayList<ArtworkDto> artworkDto = new ArrayList<ArtworkDto>();
        int j=0;
        for ( Artwork a: artwork){j++;}
        for(int i=0; i<j; i++ ){
            ArtworkDto art=new ArtworkDto();
            artworkDto.add(art);
        }
        for ( Artwork a: artwork){
           for(ArtworkDto art: artworkDto){
               art.setDocument_artist( a.getArtist().getDocument());
               art.setInscription_code(a.getInscription_code());
               art.setName(a.getName());
               art.setNumber_room(a.getRoom().getCode());
               art.setPrice(a.getPrice());
        }
        }
        return new ResponseEntity<>((Iterable)artworkDto, HttpStatus.OK);
    }


}
