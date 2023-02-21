package com.cuneyt.bank.service.impl;

import com.cuneyt.bank.entity.Customer;
import com.cuneyt.bank.repository.ICustomerRepository;
import com.cuneyt.bank.service.ICustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService {

    private final ICustomerRepository iCustomerRepository;

    public CustomerServiceImpl(ICustomerRepository iCustomerRepository) {
        this.iCustomerRepository = iCustomerRepository;
    }

    @Override
    public String paraYatir(Customer customer, String banka) {
        Object toplamPara = iCustomerRepository.getTotalMoney() != null ? (float)(iCustomerRepository.getTotalMoney()) + customer.getMiktar() :  customer.getMiktar();
        customer.setToplamPara((float)toplamPara);
        customer.setBankaAdi(banka);
        iCustomerRepository.save(customer);
        return customer.getAd() + " " + customer.getSoyAd() + " tarafından " + banka + " bankasına " + customer.getMiktar() + " TL yatırıldı.";
    }

}