package com.basic.dp.singleton;

public class StaticBlockSingletonDP_02 {

    public static StaticBlockSingletonDP_02 instance=null;
    private StaticBlockSingletonDP_02(){
        System.out.println("Private StaticBlockSingletonDP_02 constructor " +instance);
    }
    static {
        instance=new StaticBlockSingletonDP_02();
    }
}
