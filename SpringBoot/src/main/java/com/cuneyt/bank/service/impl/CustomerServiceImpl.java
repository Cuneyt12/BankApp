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
    public void paraYatir(Customer customer) {
        iCustomerRepository.save(customer);
    }
}
