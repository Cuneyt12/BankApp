package com.cuneyt.bank.controller;

import com.cuneyt.bank.entity.GarantiBank;
import com.cuneyt.bank.service.ParaYatirmaService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/musteri")
public class GarantiController {


    private final ParaYatirmaService paraYatirmaService;

    public GarantiController(@Qualifier("garantiServiceImpl") ParaYatirmaService paraYatirmaService) {
        this.paraYatirmaService = paraYatirmaService;
    }

    @PostMapping("/garanti/para-yatir")
    public ResponseEntity<String> paraYatirGaranti(@RequestBody GarantiBank garantiBank) {
        return ResponseEntity.ok(paraYatirmaService.paraYatir(garantiBank));
    }
}