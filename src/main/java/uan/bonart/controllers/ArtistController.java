package uan.bonart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uan.bonart.entities.Artist;
import uan.bonart.service.IArtistService;

@RestController
@RequestMapping({ "/artist" })
//@CrossOrigin(origins = "*")
public class ArtistController {

	@Autowired
	IArtistService artistService;
	
	@PostMapping("/create")
	public ResponseEntity<Artist> create(@RequestBody Artist artist) {
		return new ResponseEntity<>(artistService.create(artist), HttpStatus.OK);
	}
}
