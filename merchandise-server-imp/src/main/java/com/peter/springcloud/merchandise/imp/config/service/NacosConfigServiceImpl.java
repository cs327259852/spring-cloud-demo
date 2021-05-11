package com.peter.springcloud.merchandise.imp.config.service;

import com.peter.springcloud.merchandise.api.config.NacosConfigService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosConfigServiceImpl implements NacosConfigService {
    @Value("${common.name}")
    private String nacosValue;

    @Override
    public String getOne() {
        return nacosValue;
    }
}
