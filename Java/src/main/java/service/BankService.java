package service;

import model.UserModel;

public abstract class BankService implements IBankService {
    public abstract void paraYatir(UserModel userModel);
}
