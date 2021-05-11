package com.peter.springcloud.merchandise.api.config;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * nacos配置中心获取配置服务失败回调接口
 */
@Component
@Slf4j
public class NacosConfigFalbackFactory implements FallbackFactory<NacosConfigService> {
    @Override
    public NacosConfigService create(Throwable cause) {
        log.error("nacos config server fallback:{}",cause);
        return new NacosConfigService() {
            @Override
            public String getOne() {
                return "配置中心服务熔断";
            }
        };
    }


}
