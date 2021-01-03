package com.basic.dp.app;

import com.basic.dp.factory.OS;
import com.basic.dp.factory.OSFactory;

public class TestFactoryDP {
    public static void main(String[] args) {
        OSFactory osf=new OSFactory();
        OS os1=  osf.getInstance("Open");
      //  OS os2= osf.getInstance("Closed");
       // OS os3=   osf.getInstance("Windows");
        os1.spec();
        //os2.spec();
        //os3.spec();
    }
}
