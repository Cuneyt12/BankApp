package service;

import bank.GarantiBank;
import model.UserModel;

public class BankService {
    UserService userService;
    IUserService iUserService;
    public BankService(UserModel userModel){
        if (userService == null){
            userService = new GarantiBank(); // or new ZiraatBank();
        }
        /*if (iUserService == null){
            iUserService = new GarantiBank();
        }*/
        userService.paraYatir(userModel);
        //iUserService.paraYatir(userModel);
    }
}
