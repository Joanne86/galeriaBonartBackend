package uan.bonart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uan.bonart.entities.Seller;
import uan.bonart.service.ISellerService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping( "/seller-api" )
public class SellerController {
    @Autowired
    ISellerService sellerService;

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<Seller>> findAll() {
        return new ResponseEntity<>(sellerService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Seller> create(@RequestBody Seller seller) {
        return new ResponseEntity<>(sellerService.create(seller), HttpStatus.OK);
    }
}
