package edu.nju.careerbridge.youth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import edu.nju.careerbridge.youth.bean.*;
import edu.nju.careerbridge.youth.bean.ResultMessageBean;

import edu.nju.careerbridge.youth.blservice.UserBLService;

import java.util.Map;

//访问：localhost:8080/user/hello，路径中不用加cloud
@Api(value = "用户模块", description = "用户相关接口")
@RestController
@RequestMapping("/user")
public class UserController {


    private final UserBLService userBLService;

    @Autowired
    public UserController(UserBLService userBLService){
        this.userBLService=userBLService;
    }

    /*
    登录
     */

    @ApiOperation(value = "账号密码登录", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String"),

    })
    @PostMapping("/login")
    public ResultMessageBean login(@RequestBody String param) {
        JSONObject jo = new JSONObject();
        Map<String, String> m=(Map<String, String> )jo.parse(param);
        return userBLService.login(m.get("phone"), m.get("password"));
    }


    /*
    注册
     */

    @ApiOperation(value = "注册", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String"),
            @ApiImplicitParam(name = "mail", value = "邮箱", required = true, dataType = "String"),
            @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String"),

    })
    @PostMapping("/sign-up")
    public ResultMessageBean signUp(@RequestBody String param) {
        JSONObject jo = new JSONObject();
        Map<String, String> m=(Map<String, String> )jo.parse(param);
        return userBLService.signUp(m.get("phone"), m.get("password"), m.get("mail"), m.get("name"));


    }

    /*
    修改密码
     */

    @ApiOperation(value = "修改密码", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String"),

    })
    @PostMapping("/password")
    public ResultMessageBean editPassword(String phone, String password) {
       return userBLService.editPassword(phone,password);
    }




    /*
    填写用户基本信息
     */

    @ResponseBody
    @RequestMapping(
            value = "/userBasicMessage",
            method = RequestMethod.POST,
            produces = {"application/json; charset=UTF-8"})
    public ResultMessageBean saveUserBasicMessage(@RequestBody String param) {
        JSONObject jo = new JSONObject();
        Map<String, String> m=(Map<String, String> )jo.parse(param);
        UserBasicMessageBean userBasicMessageBean = new UserBasicMessageBean(m.get("phone"), m.get("realName"), m.get("birthday"),
                m.get("gender"), m.get("address"), Double.parseDouble(m.get("jobYear")), m.get("salary"), Integer.parseInt(m.get("lowSalary")),
                Integer.parseInt(m.get("highSalary")), Integer.parseInt(m.get("basicSalary")), Integer.parseInt(m.get("bonus")),
                Integer.parseInt(m.get("Commission")), Integer.parseInt(m.get("stockShareOption")));
        return userBLService.saveUserBasicMessage(userBasicMessageBean);
    }

     /*
    得到用户基本信息
     */

    @ApiOperation(value = "得到用户基本信息", notes = "可能状态码：45,44,34,35")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号码", required = true, dataType = "MultipartFile")
    })
    @PostMapping("/getUserBasicMessage")
    public UserBasicMessageBean getUserBasicMessage(String phone) {
        return userBLService.getUserBasicMessage(phone);
    }











}
