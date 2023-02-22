package com.cuneyt.bank.service.impl;

import com.cuneyt.bank.entity.BaseEntity;
import com.cuneyt.bank.entity.GarantiBank;
import com.cuneyt.bank.repository.IGarantiRepository;
import com.cuneyt.bank.service.ParaYatirmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GarantiServiceImpl   implements ParaYatirmaService {

    @Autowired
    IGarantiRepository iGarantiRepository;

    @Override
    public String paraYatir(BaseEntity baseEntity) {
        GarantiBank  newEntity = (GarantiBank) baseEntity;
        Object toplamPara = iGarantiRepository.getTotalMoney(newEntity.getTc()) != null ? (float)iGarantiRepository.getTotalMoney(newEntity.getTc()) + newEntity.getMiktar() : newEntity.getMiktar();
        newEntity.setToplamPara((float)toplamPara);
        iGarantiRepository.save(newEntity);
        return newEntity.getAd() + " " + newEntity.getSoyAd() + " tarafından garanti bankasına " + newEntity.getMiktar() + " TL yatırıldı";
    }
}


