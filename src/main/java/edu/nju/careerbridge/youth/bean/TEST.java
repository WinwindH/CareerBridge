package edu.nju.careerbridge.youth.bean;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TEST {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println( "hello" );
        return "hello";
    }
}
