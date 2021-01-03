package com.basic.dp.app;

import com.basic.dp.builder.Phone;
import com.basic.dp.builder.PhoneBuilder;

public class TestBuilderDP {
    public static void main(String[] args) {
       // Phone p=new Phone("Android",2,"Qualcom",5.5,1000);
        Phone p=new PhoneBuilder().setOs("Android").setBattery(10000).getPhone();
        System.out.println(p);
    }
}
