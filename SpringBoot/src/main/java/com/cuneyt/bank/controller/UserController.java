package com.cuneyt.bank.controller;

import com.cuneyt.bank.entity.User;
import com.cuneyt.bank.service.IUserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kullanici")
public class UserController {
    private final IUserService iUserService;

    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @PostMapping("/yatir")
    public ResponseEntity<User> addPersonel(@RequestBody User user) {
        return ResponseEntity.ok(user);
    }

}
