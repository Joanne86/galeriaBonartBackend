package uan.bonart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uan.bonart.entities.Room;
import uan.bonart.entities.Seller;
import uan.bonart.service.IRoomService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping( "/room-api" )
public class RoomController {
    @Autowired
    IRoomService roomService;

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<Room>> findAll() {
        return new ResponseEntity<>(roomService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/getCode")
    public ResponseEntity<Integer> getCode(@RequestParam String document) {
        return new ResponseEntity<>(roomService.getCode(document), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Room> create(@RequestBody Room room) {
        return new ResponseEntity<>(roomService.create(room), HttpStatus.OK);
    }
}
