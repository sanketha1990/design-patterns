package com.basic.dp.factory;

public class OSFactory {

    public OS getInstance(String str){
        if(str.equals("Open")){
            return new Android();
        }else if(str.equals("Closed")){
            return new IOS();
        }else{
            return new Windows();
        }
    }
}
