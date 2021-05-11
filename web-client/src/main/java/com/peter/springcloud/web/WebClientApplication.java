package com.peter.springcloud.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;


@EnableCircuitBreaker
//注意此处 springboot默认扫描和启动类同级或同级下的所有子包，
// 由于fallback类放在了其他包下面，此处需要添加对应的包扫描 否则无法实例化fallback类
@SpringBootApplication(scanBasePackages = {"com.peter.springcloud.merchandise.api","com.peter.springcloud"})
@EnableFeignClients(basePackages =
        {
                "com.peter.springcloud.merchandise.api"
        }
)
@EnableDiscoveryClient
public class WebClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebClientApplication.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }
}
