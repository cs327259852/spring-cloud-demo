package com.peter.springcloud.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static int i = 0;
    @RequestMapping(value="/test")
    public Object test()throws Exception{
        System.out.println(i++);
        Thread.sleep(10*60*1000);
        return "ok";
    }

    @RequestMapping(value="/test2")
    public Object test2(){
        return "no";
    }
}
