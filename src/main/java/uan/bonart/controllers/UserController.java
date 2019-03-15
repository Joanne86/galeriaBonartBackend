package uan.bonart.controllers;

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

import uan.bonart.service.IUserService;

@RestController
@RequestMapping({ "/user-api" })
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private IUserService userService;

	@GetMapping(value = "/health")
	public ResponseEntity<String> health() {
		return new ResponseEntity<>("OK", HttpStatus.OK);
	}

	/*@PostMapping("/create")
	public ResponseEntity<User> create(@RequestBody User user) {
		return new ResponseEntity<>(userService.create(user), HttpStatus.OK);
	}

	/*@GetMapping("/findById")
	public ResponseEntity<User> findOne(@RequestParam int id) throws ResourceNotFoundException {
		return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
	}*/
	/*@GetMapping("/findAllByIdsesion")
	public ResponseEntity<Iterable<User>> findALLByIdsesion(@RequestParam int idsesion) throws ResourceNotFoundException {
		return new ResponseEntity<>(userService.findAllByIdsesion(idsesion), HttpStatus.OK);
	}
	@GetMapping("/getSesion")
	public ResponseEntity<Sesion> getSesion(@RequestParam String username, @RequestParam String password) throws ResourceNotFoundException {
		return new ResponseEntity<>(userService.getSesion(username, password), HttpStatus.OK);
	}

	/*@PutMapping("/update")
	public ResponseEntity<User> update(@RequestBody User user) throws ResourceNotFoundException {
		return new ResponseEntity<>(userService.update(user), HttpStatus.OK);
	}*/

	/*@DeleteMapping("/delete")
	public ResponseEntity<Object> delete(@RequestBody User user) throws ResourceNotFoundException {
		userService.delete(user);
		return new ResponseEntity<>(HttpStatus.OK);
	}*/

	/*@DeleteMapping("/deleteById")
	public ResponseEntity<Object> delete(@RequestParam int id) throws ResourceNotFoundException {
		userService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/findAll")
	public ResponseEntity<Iterable<User>> findAll() {
		return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
	}*/
}
