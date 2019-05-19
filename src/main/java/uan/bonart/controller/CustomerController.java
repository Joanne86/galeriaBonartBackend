package uan.bonart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uan.bonart.entities.Customer;
import uan.bonart.service.ICustomerService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping( "/customer-api" )
public class CustomerController {
    @Autowired
    ICustomerService customerService;

    @GetMapping("/findAll")
    public ResponseEntity<List<Customer>> findAll() {
        return new ResponseEntity(customerService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/findByDocument")
    public boolean findByDocument(@RequestParam String document) {
        return (customerService.findByDocument(document));
    }
    @PostMapping("/create")
    public ResponseEntity<Customer> create(@RequestBody Customer customer) {
        return new ResponseEntity<>(customerService.create(customer), HttpStatus.OK);
    }

}
