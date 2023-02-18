import bank.GarantiBank;
import bank.ZiraatBank;
import model.BankModel;
import model.UserModel;
import service.BankService;
import service.IBankService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String isim;
        float miktar;
        Scanner in = new Scanner(System.in);
        UserModel userModel = new UserModel();

        System.out.print("isim: ");
        isim = in.nextLine();
        System.out.print("yatırılan miktar: ");
        miktar = in.nextFloat();

        userModel.setIsim(isim);
        userModel.setMiktar(miktar);

        BankModel bankModel = new BankModel(userModel);


    }
}
