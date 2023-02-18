package bank;

import model.UserModel;
import service.BankService;

import java.util.Scanner;

public class GarantiBank extends BankService {

    @Override
    public void paraYatir(UserModel userModel) {
        System.out.println(userModel.getIsim() + " tarafından garanti bankasına " + userModel.getMiktar() + " TL yatırıldı");
    }
}
