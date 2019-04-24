package uan.bonart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uan.bonart.entities.Sale;
import uan.bonart.service.ISaleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping( "/sale-api" )
public class SaleController {

    @Autowired
    ISaleService saleService;

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<Sale>> findAll() {
        return new ResponseEntity<>(saleService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Sale> create(@RequestBody Sale sale) {
        return new ResponseEntity<>(saleService.create(sale), HttpStatus.OK);
    }
}
