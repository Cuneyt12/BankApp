package com.cuneyt.bank.controller;

import com.cuneyt.bank.entity.Customer;
import com.cuneyt.bank.service.ICustomerService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/musteri")
public class CustomerController {

    private final ICustomerService iCustomerService;

    public CustomerController(@Qualifier("customerServiceImpl") ICustomerService iCustomerService) {
        this.iCustomerService = iCustomerService;
    }

    @PostMapping("/paraYatir/{banka}")
    public ResponseEntity<String> paraYatir(@RequestBody Customer customer, @PathVariable String banka) {
        return ResponseEntity.ok(iCustomerService.paraYatir(customer, banka));
    }

}
