package com.cuneyt.bank.service;

import com.cuneyt.bank.entity.BaseEntity;
import org.springframework.stereotype.Service;

@Service
public interface ParaYatirmaService {
    String paraYatir(BaseEntity baseEntity);
}
