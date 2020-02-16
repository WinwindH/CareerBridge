package edu.nju.careerbridge.youth.blservice;

import edu.nju.careerbridge.youth.bean.*;

public interface UserBLService {


    ResultMessageBean login(String username, String password);
    ResultMessageBean signUp(String phone, String password, String mail, String name);
    ResultMessageBean editPassword(String phone, String password);

    ResultMessageBean saveUserBasicMessage(UserBasicMessageBean userBasicMessageBean);
    UserBasicMessageBean getUserBasicMessage(String phone);


}
