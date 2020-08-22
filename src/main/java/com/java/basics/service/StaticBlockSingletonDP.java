package com.java.basics.service;

public class StaticBlockSingletonDP {

    public static StaticBlockSingletonDP instance=null;
    private StaticBlockSingletonDP(){
        System.out.println("Private StaticBlockSingletonDP constructor" +instance);
    }
    static {
        instance=new StaticBlockSingletonDP();
    }
}
