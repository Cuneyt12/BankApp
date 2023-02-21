package com.cuneyt.bank.service.impl;

import com.cuneyt.bank.entity.User;
import com.cuneyt.bank.repository.IUserRepository;
import com.cuneyt.bank.service.IUserService;

public class UserServiceImpl implements IUserService {

    private final IUserRepository iUserRepository;

    public UserServiceImpl(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }

    @Override
    public void paraYatir(User user) {
        iUserRepository.save(user);
    }
}
