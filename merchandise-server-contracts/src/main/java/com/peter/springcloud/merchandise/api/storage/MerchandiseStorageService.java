package com.peter.springcloud.merchandise.api.storage;

import com.peter.springcloud.merchandise.model.storage.MerchandiseStorage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//注意 path是服务的访问根目录
@FeignClient(
        name = "merchandise-server-imp",
        path = "/merchandise-server-imp",
//callback 和 callBackFactory同时存在时  只有callback生效
//        fallback = MerchandiseStorageFallBack.class,
        fallbackFactory = MerchandiseStorageFallBackFactory.class
)
public interface MerchandiseStorageService {

    @RequestMapping("/merchandise/getMerchandiseStorage")
    public MerchandiseStorage getMerchandiseStorage(@RequestParam("prodno")String prodno);
}
