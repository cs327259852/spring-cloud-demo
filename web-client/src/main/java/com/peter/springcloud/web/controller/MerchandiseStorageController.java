package com.peter.springcloud.web.controller;

import com.peter.springcloud.merchandise.api.storage.MerchandiseStorageService;
import com.peter.springcloud.merchandise.model.storage.MerchandiseStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/merchandise")
public class MerchandiseStorageController {

    @Autowired
    private MerchandiseStorageService merchandiseStorageService;

    @RequestMapping("/getMerchandiseStorage")
    public MerchandiseStorage getMerchandiseStorage(){
        return merchandiseStorageService.getMerchandiseStorage("test");
    }

    // 服务实例名
    private static final String REST_URL_PREFIX = "http://MERCHANDISE-SERVER-IMP";

    /**
     * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
     * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/test")
    public Object test() {
        return restTemplate.getForEntity(REST_URL_PREFIX + "/merchandise-server-imp/merchandise/getMerchandiseStorage?prodno=123",  Object.class);
    }


}
