package com.peter.springcloud.merchandise.imp.config.service;

import com.peter.springcloud.merchandise.api.config.NacosConfigService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class NacosConfigServiceImpl implements NacosConfigService {
    @Value("${common.name}")
    private String nacosValue;
    @Value("${infr.common.name}")
    private String nacosOriginValue;

    @Override
    public String getOne() {
        return nacosOriginValue;
    }
}
