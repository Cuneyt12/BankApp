package bank;


import model.UserModel;
import service.BankService;

import java.util.Scanner;

public class ZiraatBank extends BankService {

    @Override
    public void paraYatir(UserModel userModel) {
        System.out.println(userModel.getIsim() + " tarafından ziraat bankasına " + userModel.getMiktar() + " TL yatırıldı");
    }
}
