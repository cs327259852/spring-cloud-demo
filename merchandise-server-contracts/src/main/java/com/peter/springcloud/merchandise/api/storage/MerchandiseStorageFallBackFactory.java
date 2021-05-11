package com.peter.springcloud.merchandise.api.storage;

import com.peter.springcloud.merchandise.model.storage.MerchandiseStorage;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 商品库存服务熔断工厂
 */
@Component
@Slf4j
public class MerchandiseStorageFallBackFactory implements FallbackFactory<MerchandiseStorageService> {
    @Override
    public MerchandiseStorageService create(Throwable cause) {
        log.error("=================》fallback reason was:  " + cause.getMessage());
        return new MerchandiseStorageService() {
            @Override
            public MerchandiseStorage getMerchandiseStorage(String prodno) {
                MerchandiseStorage r = new MerchandiseStorage();
                 r.setServerInfo("熔断");
                 return r;
            }
        };
    }
}
