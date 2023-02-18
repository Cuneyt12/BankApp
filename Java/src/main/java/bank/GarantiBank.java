package bank;

import model.UserModel;
import service.IUserService;
import service.UserService;

public class GarantiBank extends UserService implements IUserService {

    @Override
    public void paraYatir(UserModel userModel) {
        System.out.println(userModel.getIsim() + " tarafından garanti bankasına " + userModel.getMiktar() + " TL yatırıldı");
    }
}
