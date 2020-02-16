package edu.nju.careerbridge.youth.bl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.nju.careerbridge.youth.bean.*;
import edu.nju.careerbridge.youth.blservice.UserBLService;
import edu.nju.careerbridge.youth.dao.*;
import edu.nju.careerbridge.youth.model.*;

@Service
public class UserBL implements UserBLService {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private UserBasicMessageRepository userBasicMessageRepository;


    @Override
    public ResultMessageBean login(String phone, String password) {

        try {
            String realPassword= userRepository.findByPhone(phone).getPassword();
            System.out.println(realPassword);
            System.out.println(password);
            if (realPassword.equals(password)) {
                return new ResultMessageBean(true, "登陆成功");

            } else {
                return new ResultMessageBean(false, "登录失败");

            }


        }catch (Exception e){
            return new ResultMessageBean(false, "登录失败");

        }
    }

    @Override
    public ResultMessageBean signUp(String phone, String password, String mail, String name) {


        User user=new User(phone, mail, password, name);
       try{
            userRepository.save(user);
        }catch (Exception e){

            return new ResultMessageBean(false,"手机号已注册");

        }


        return new ResultMessageBean(true);
    }

    @Override
    public ResultMessageBean editPassword(String phone, String password) {
        try {
            userRepository.editPassword(phone,password);
            return new ResultMessageBean(true,"密码修改成功");
        }catch (Exception e){
            return new ResultMessageBean(false,"密码修改失败");
        }
    }

    @Override
    public ResultMessageBean saveUserBasicMessage(UserBasicMessageBean userBasicMessageBean) {

        String phone = userBasicMessageBean.getPhone();
        UserBasicMessage userBasicMessage=new UserBasicMessage();
        BeanUtils.copyProperties(userBasicMessageBean,userBasicMessage);

        userBasicMessageRepository.deleteByPhone(phone);

        try{
            userBasicMessageRepository.save(userBasicMessage);

        }catch (Exception e){

            return new ResultMessageBean(false,"填写用户基本信息失败");

        }
        return new ResultMessageBean(true);
    }

    @Override
    public UserBasicMessageBean getUserBasicMessage(String phone) {
        UserBasicMessageBean userBasicMessageBean=new UserBasicMessageBean();
        BeanUtils.copyProperties(userBasicMessageRepository.findByPhone(phone),userBasicMessageBean);

        return userBasicMessageBean;
    }


}
