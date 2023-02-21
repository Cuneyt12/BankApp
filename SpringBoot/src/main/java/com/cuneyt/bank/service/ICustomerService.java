package com.cuneyt.bank.service;

import com.cuneyt.bank.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerService {
    void paraYatir(Customer customer);
}
