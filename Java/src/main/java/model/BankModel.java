package model;

import bank.GarantiBank;
import bank.ZiraatBank;
import service.BankService;
import service.IBankService;

public class BankModel {
    BankService bankService;
    //IBankService iBankService;
    public BankModel(UserModel userModel){
        if (bankService == null){
            bankService = new GarantiBank(); // or new ZiraatBank();
        }
        /*if (iBankService == null){
            iBankService = new GarantiBank();
        }*/
        bankService.paraYatir(userModel);
        //iBankService.paraYatir(userModel);
    }
}
