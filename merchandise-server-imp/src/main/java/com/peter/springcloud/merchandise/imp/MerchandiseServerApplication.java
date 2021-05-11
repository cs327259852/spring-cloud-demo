package com.peter.springcloud.merchandise.imp;

import com.alibaba.nacos.api.config.annotation.NacosProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//新版springcloud可以省略该注解也可注册到eureka 只需相关配置即可
//@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages =
        {
                "com.peter.springcloud.merchandise.api"
        }
)
public class MerchandiseServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MerchandiseServerApplication.class,args);
    }
}
