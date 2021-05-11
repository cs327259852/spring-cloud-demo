package com.peter.springcloud.utils;

import java.lang.management.ManagementFactory;

public class Utils {

    public static String getServerInfo(){
        String name = ManagementFactory.getRuntimeMXBean().getName();
        return name;
    }
}
