package com.peter.springcloud.merchandise.model.storage;

import lombok.Data;

@Data
public class MerchandiseStorage {

    private String prodNo;

    private Double storage;

    private String serverInfo;
}
