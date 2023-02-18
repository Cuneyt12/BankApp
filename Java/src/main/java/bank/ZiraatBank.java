package bank;

import model.UserModel;
import service.IUserService;
import service.UserService;

public class ZiraatBank extends UserService implements IUserService {

    @Override
    public void paraYatir(UserModel userModel) {
        System.out.println(userModel.getIsim() + " tarafından ziraat bankasına " + userModel.getMiktar() + " TL yatırıldı");
    }
}
