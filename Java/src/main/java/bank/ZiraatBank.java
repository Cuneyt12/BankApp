package bank;

import model.UserModel;
import service.BankService;
import service.IBankService;

public class ZiraatBank extends BankService implements IBankService {

    @Override
    public void paraYatir(UserModel userModel) {
        System.out.println(userModel.getIsim() + " tarafından ziraat bankasına " + userModel.getMiktar() + " TL yatırıldı");
    }
}
