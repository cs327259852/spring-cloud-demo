package com.peter.springcloud.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value="/test")
    public Object test(){
        return "ok";
    }

    @RequestMapping(value="/test2")
    public Object test2(){
        return "no";
    }
}
