package com.cuneyt.bank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kullanici")
public class UserController {

    @PostMapping("/yatir")
    public ResponseEntity<String> addPersonel(@RequestBody String user) {
        return ResponseEntity.ok("");
    }

}
