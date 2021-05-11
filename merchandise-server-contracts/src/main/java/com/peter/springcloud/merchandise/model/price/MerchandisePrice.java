package com.peter.springcloud.merchandise.model.price;

import lombok.Data;

import java.io.Serializable;

@Data
public class MerchandisePrice implements Serializable {

    private String prodName;

    private String prodNo;

    private Double price;

    private String serverInfo;
}
