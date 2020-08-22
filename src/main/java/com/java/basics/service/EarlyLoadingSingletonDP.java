package com.java.basics.service;

public class EarlyLoadingSingletonDP {
    private static final EarlyLoadingSingletonDP instace=new EarlyLoadingSingletonDP();
    private EarlyLoadingSingletonDP(){
        System.out.println("Private EarlyLoadingSingletonDP Constructor "+instace);
    }
    public static EarlyLoadingSingletonDP getInstace(){
 return  instace;
    }
}
