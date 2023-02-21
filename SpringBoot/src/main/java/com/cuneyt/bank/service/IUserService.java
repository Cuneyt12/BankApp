package com.cuneyt.bank.service;

import com.cuneyt.bank.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    void paraYatir(User user);
}
