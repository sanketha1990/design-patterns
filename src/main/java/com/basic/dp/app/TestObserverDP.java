package com.basic.dp.app;

import com.basic.dp.observer.Channel;
import com.basic.dp.observer.Subscriber;

public class TestObserverDP {
    public static void main(String[] args) {

        Subscriber s1=new Subscriber("Sanketh");
        Subscriber s2=new Subscriber("Samip");
        Subscriber s3=new Subscriber("Samart");
        Subscriber s4=new Subscriber("Virat");
        Subscriber s5=new Subscriber("Vikyat");

        Channel telusko=new Channel();
        telusko.subscriber(s1);
        telusko.subscriber(s2);
        telusko.subscriber(s3);
        telusko.subscriber(s4);
        telusko.subscriber(s5);

        s1.subscribeChannel(telusko);
        s2.subscribeChannel(telusko);
        s3.subscribeChannel(telusko);
        s4.subscribeChannel(telusko);
        s5.subscribeChannel(telusko);


        telusko.unSubscribe(s4);

        telusko.upload("How to learn programming !");

    }
}
