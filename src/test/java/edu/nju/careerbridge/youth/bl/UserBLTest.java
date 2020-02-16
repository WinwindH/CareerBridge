package edu.nju.careerbridge.youth.bl;

import edu.nju.careerbridge.youth.CareerbridgeApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import edu.nju.careerbridge.youth.bean.*;
import edu.nju.careerbridge.youth.blservice.UserBLService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CareerbridgeApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserBLTest {

    @Autowired
    private UserBLService userBLService;

    @Test
    public void saveExpectation() throws Exception {

    }

    @Test
    public void getExpectation() throws Exception {

    }

    @Test
    public void saveUserBasicMessage() throws Exception {
        System.out.println("【开始】");


        UserBasicMessageBean u2=new UserBasicMessageBean("100","bob","1998-10-10","sex","上海",2.5,
                "3w",20000,40000,10000,666,10086,1);

        userBLService.saveUserBasicMessage(u2);

        Assert.assertEquals("1","1");
    }



//    @Test
//    public void getUserBasicMessage() throws Exception {
//        System.out.println("【开始】");
//
//        System.out.println( userBLService.getUserBasicMessage("100"));
//
//        Assert.assertEquals("1","1");
//    }


}