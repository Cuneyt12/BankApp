package service;

import bank.GarantiBank;
import model.UserModel;

public class BankService {
    UserService userService;
    public BankService(UserModel userModel){
        if (userService == null){
            userService = new GarantiBank();
        }
        userService.paraYatir(userModel);
    }
}
