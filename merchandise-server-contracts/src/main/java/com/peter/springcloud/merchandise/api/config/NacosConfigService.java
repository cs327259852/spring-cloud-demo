package com.peter.springcloud.merchandise.api.config;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 获取商品微服物配置信息接口-测试nacos配置中心
 */
@FeignClient(name="merchandise-server-imp",
        path="/merchandise-server-imp",
        fallbackFactory = NacosConfigFalbackFactory.class)
public interface NacosConfigService {

    @RequestMapping("/nacos/getOne")
    public String getOne();

}
