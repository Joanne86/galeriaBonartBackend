package uan.bonart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;


import uan.bonart.entities.Artist;
import uan.bonart.exception.ResourceNotFoundException;
import uan.bonart.service.IArtistService;

import java.util.List;

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
	public ResponseEntity<Artist> delete(@RequestBody Artist artist) throws ResourceNotFoundException {
		artistService.delete(artist);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteById")
	public ResponseEntity<Object> delete(@RequestParam String id) throws ResourceNotFoundException {
		artistService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Artist> update(@RequestBody Artist artist) throws ResourceNotFoundException {
		return new ResponseEntity<>(artistService.update(artist), HttpStatus.OK);
	}
	
	@GetMapping("/findById")
	public ResponseEntity<Artist> findOne(@RequestParam String id) throws ResourceNotFoundException {
		return new ResponseEntity<>(artistService.findById(id), HttpStatus.OK);
	}
}
