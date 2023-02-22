package com.cuneyt.bank.controller;

import com.cuneyt.bank.entity.ZiraatBank;
import com.cuneyt.bank.service.ParaYatirmaService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/musteri")
public class ZiraatController {


    private final ParaYatirmaService paraYatirmaService;

    public ZiraatController(@Qualifier("ziraatServiceImpl") ParaYatirmaService paraYatirmaService) {
        this.paraYatirmaService = paraYatirmaService;
    }

    @PostMapping("/ziraat/para-yatir")
    public ResponseEntity<String> paraYatirZiraat(@RequestBody ZiraatBank ziraatBank) {
        return ResponseEntity.ok(paraYatirmaService.paraYatir(ziraatBank));
    }
}