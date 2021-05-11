package com.peter.springcloud.merchandise.imp.controller;

import com.peter.springcloud.merchandise.model.price.MerchandisePrice;
import com.peter.springcloud.utils.Utils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

    @RequestMapping(value="priceList.json")
    public MerchandisePrice getPriceList(){
        MerchandisePrice m = new MerchandisePrice();
        m.setPrice(200D);
        m.setProdName("prodno");
        m.setProdNo("00");
        m.setServerInfo(Utils.getServerInfo());
        return m;
    }


}
