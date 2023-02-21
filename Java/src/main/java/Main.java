import service.BankService;
import model.UserModel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        UserModel userModel = new UserModel();

        System.out.print("isim: ");
        String isim = in.nextLine();
        System.out.print("yatırılan miktar: ");
        float miktar = in.nextFloat();

        userModel.setIsim(isim);
        userModel.setMiktar(miktar);

        BankService bankService = new BankService(userModel);
    }
}
