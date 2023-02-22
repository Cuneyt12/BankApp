package com.cuneyt.bank.service.impl;

import com.cuneyt.bank.entity.BaseEntity;
import com.cuneyt.bank.entity.ZiraatBank;
import com.cuneyt.bank.repository.IZiraatRepository;
import com.cuneyt.bank.service.ParaYatirmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZiraatServiceImpl  implements ParaYatirmaService {

    @Autowired
    private IZiraatRepository iZiraatRepository;

    @Override
    public String paraYatir(BaseEntity baseEntity) {
        ZiraatBank newEntity = (ZiraatBank) baseEntity;
        Object toplamPara = iZiraatRepository.getTotalMoney(newEntity.getTc()) != null ? (float)iZiraatRepository.getTotalMoney(newEntity.getTc()) + newEntity.getMiktar() : newEntity.getMiktar();
        newEntity.setToplamPara((float)toplamPara);
        iZiraatRepository.save(newEntity);
        return newEntity.getAd() + " " + newEntity.getSoyAd() + " tarafından ziraat bankasına " + newEntity.getMiktar() + " TL yatırıldı.";
    }
}