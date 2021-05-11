package com.peter.springcloud.web.controller;

import com.peter.springcloud.merchandise.api.config.NacosConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosConfigCOntroller {

    @Autowired
    private NacosConfigService nacosConfigService;

    @RequestMapping("/nacos/getOne")
    public String getOne(){
        return nacosConfigService.getOne();
    }
}
