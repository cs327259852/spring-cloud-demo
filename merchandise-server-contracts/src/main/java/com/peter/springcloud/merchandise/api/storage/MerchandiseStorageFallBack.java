package com.peter.springcloud.merchandise.api.storage;

import com.peter.springcloud.merchandise.model.storage.MerchandiseStorage;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商品库存服务异常处理类
 */
@Component
public class MerchandiseStorageFallBack implements MerchandiseStorageService {

    @Override
    public MerchandiseStorage getMerchandiseStorage(String prodno) {
        MerchandiseStorage df = new MerchandiseStorage();
        df.setServerInfo("error");
        return df;
    }

    public MerchandiseStorageFallBack(){
        System.out.println("fallback created.>>>>>>>>>>>>>>>>>>>>>");
    }
}
