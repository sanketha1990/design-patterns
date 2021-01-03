package com.basic.dp.singleton;

public class EarlyLoadingSingletonDP_01 {
    private static final EarlyLoadingSingletonDP_01 instace=new EarlyLoadingSingletonDP_01();
    private EarlyLoadingSingletonDP_01(){
        System.out.println("Private EarlyLoadingSingletonDP_01 Constructor "+instace);
    }
    public static EarlyLoadingSingletonDP_01 getInstace(){
 return  instace;
    }
}
