package com.mmd.mmdapp.controller;

import com.mmd.mmdapp.utils.Result;
import com.mmd.mmdapp.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    @ResponseBody
    Result home(HttpServletResponse request){
        System.out.println("mmdapp in !");
        return (new Result(1,"成功"));
    }

    @RequestMapping("/now")
    String now(HttpServletResponse request){
        request.setHeader("Access-Control-Allow-Origin","*");
        return "现在时间："+ (new Date()).toString();
    }
    @RequestMapping("/nowtest")
    String nowtest(HttpServletResponse request){
        return "{name:'zzh'}";
    }

    @RequestMapping("/hello")
    public String index() {
        return "Hello World 张志华";
    }
    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setUsername("小明");
        user.setCrtuser("123qwe");
        return user;
    }
}
