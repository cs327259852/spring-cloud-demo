package com.peter.springcloud.web.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.peter.springcloud.merchandise.model.price.MerchandisePrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping(value = "/merchandise")
public class MerchandisePriceController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(value = "/echo")
    public Object echo(@RequestBody Map param){
        return param;
    }

    /**
     * 使用ribbon做客户端负载均衡
     * @return
     */
    @GetMapping(value = "/priceList")
    @HystrixCommand(fallbackMethod="priceListFallBack")
    public Object priceList(){
        String serviceId = "MERCHANDISE-SERVER-IMP";
        ResponseEntity<MerchandisePrice> forEntity = restTemplate.getForEntity("http://" + serviceId + "/merchandise-server-imp/priceList.json", MerchandisePrice.class);
        return forEntity.getBody();
    }


    public String priceListFallBack(){
        return "priceList error occured!";
    }



}
