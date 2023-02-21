package com.cuneyt.bank.controller;

import com.cuneyt.bank.entity.Customer;
import com.cuneyt.bank.service.ICustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kullanici")
public class CustomerController {
    private final ICustomerService iCustomerService;

    public CustomerController(ICustomerService iCustomerService) {
        this.iCustomerService = iCustomerService;
    }

    @PostMapping("/yatir")
    public ResponseEntity<String> paraYatir(@RequestBody Customer customer) {
        return ResponseEntity.ok(customer.getAd() + " " + customer.getSoyAd());
    }

}
