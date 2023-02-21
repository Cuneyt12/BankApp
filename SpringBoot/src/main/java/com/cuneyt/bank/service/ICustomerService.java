package com.cuneyt.bank.service;

import com.cuneyt.bank.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerService {
    String paraYatir(Customer customer, String banka);
}
