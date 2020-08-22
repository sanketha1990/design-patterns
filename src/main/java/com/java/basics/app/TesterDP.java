package com.java.basics.app;

import com.java.basics.service.EarlyLoadingSingletonDP;

public class TesterDP {
    public static void main(String[] args) {
        EarlyLoadingSingletonDP instance=EarlyLoadingSingletonDP.getInstace();
        System.out.println("Instance = "+instance.toString());
        System.out.println("Instance = "+instance.toString());
    }
}
