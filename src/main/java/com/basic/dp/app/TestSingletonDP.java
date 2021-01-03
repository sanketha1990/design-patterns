package com.basic.dp.app;

import com.basic.dp.singleton.EarlyLoadingSingletonDP_01;

public class TestSingletonDP {
    public static void main(String[] args) {
        EarlyLoadingSingletonDP_01 instance=EarlyLoadingSingletonDP_01.getInstace();
        System.out.println("Instance = "+instance.toString());
        System.out.println("Instance = "+instance.toString());
    }
}
