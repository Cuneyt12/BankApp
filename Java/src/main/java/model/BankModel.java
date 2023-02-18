package model;

import bank.GarantiBank;
import bank.ZiraatBank;
import service.BankService;

public class BankModel {
    BankService bankService;

    public BankModel(UserModel userModel){
        if (bankService == null){
            bankService = new GarantiBank();
        }
        bankService.paraYatir(userModel);
    }
}
