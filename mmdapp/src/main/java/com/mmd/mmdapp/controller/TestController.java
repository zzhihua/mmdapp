package com.mmd.mmdapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class TestController {
    @RequestMapping("/test")
    String now(HttpServletResponse request){
        System.out.println("hello world!");
        return "index";
    }
}
