package uan.bonart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import uan.bonart.entities.Artist;
import uan.bonart.exception.ResourceNotFoundException;
import uan.bonart.service.IArtistService;

import java.util.List;
import java.util.Optional;

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
	public ResponseEntity<List<Artist>> findAll() {
		return new ResponseEntity(artistService.findAll(), HttpStatus.OK);
	}


	@PostMapping("/create")
	public ResponseEntity<Artist> create(@RequestBody Artist artist) {
		return new ResponseEntity<>(artistService.create(artist), HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<Artist> delete(@RequestParam String document ) throws ResourceNotFoundException {
		artistService.delete(document);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Artist> update(@RequestBody Artist artist) throws ResourceNotFoundException {
		return new ResponseEntity<>(artistService.update(artist), HttpStatus.OK);
	}

	@GetMapping("/findByDocument")
	public boolean findByDocument(@RequestParam String document) {
		return (artistService.findByDocument(document));
	}

	@GetMapping("/findByDocument_")
	public Optional<Artist> findByDocument_(@RequestParam String document) {
		return (artistService.findByDocument_(document));
	}
}
