package com.peter.springcloud.merchandise.imp.storage.service;

import com.peter.springcloud.merchandise.api.storage.MerchandiseStorageService;
import com.peter.springcloud.merchandise.model.storage.MerchandiseStorage;
import com.peter.springcloud.utils.Utils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchandiseStorageImpl implements MerchandiseStorageService {

    @Override
    public MerchandiseStorage getMerchandiseStorage(String prodno) {
        MerchandiseStorage s = new MerchandiseStorage();
        s.setProdNo(prodno);
        s.setStorage(100D);
        s.setServerInfo(Utils.getServerInfo());
        return s;
    }
}
