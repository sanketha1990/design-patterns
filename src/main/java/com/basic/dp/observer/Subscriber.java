package com.basic.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements IObserver{
    private String name;
    private Channel channel=new Channel();

    public Subscriber(String name){
        this.name=name;
    }
    public void update() {
        System.out.println("Hey,"+name+" Video uploaded !"+channel.getTitle());
    }

    public void subscribeChannel(Channel ch) {
        channel=ch;
    }
}
