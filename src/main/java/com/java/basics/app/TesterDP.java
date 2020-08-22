package com.java.basics.app;

import com.java.basics.singleton.EarlyLoadingSingletonDP_01;

public class TesterDP {
    public static void main(String[] args) {
        EarlyLoadingSingletonDP_01 instance=EarlyLoadingSingletonDP_01.getInstace();
        System.out.println("Instance = "+instance.toString());
        System.out.println("Instance = "+instance.toString());
    }
}
