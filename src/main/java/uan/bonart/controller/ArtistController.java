package uan.bonart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uan.bonart.entities.Artist;
import uan.bonart.service.IArtistService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping( "/artist-api" )

public class ArtistController {

	@Autowired
	IArtistService artistService;
	
	@GetMapping(value = "/health")
	public ResponseEntity<String> health() {
		return new ResponseEntity<>("OK", HttpStatus.OK);
	}
	@GetMapping("/findAll")
	public ResponseEntity<Iterable<Artist>> findAll() {
		return new ResponseEntity<>(artistService.findAll(), HttpStatus.OK);
	}
	@PostMapping("/create")
	public ResponseEntity<Artist> create(@RequestBody Artist artist) {
		System.out.println("etra aqui");	
		return new ResponseEntity<>(artistService.create(artist), HttpStatus.OK);
	}
}
