package com.basic.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    private List<IObserver> subscriberList=new ArrayList<IObserver>();
    private String title;

    public List<IObserver> getSubscriber() {
        return subscriberList;
    }

    public void setSubscriber(List<IObserver> subscriber) {
        this.subscriberList = subscriber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void subscriber(IObserver subscriber) {
        getSubscriber().add(subscriber);

    }

    public void unSubscribe(IObserver subscriber) {
        getSubscriber().remove(subscriber);
    }

    public void notifySubscriber() {
        for(IObserver subs:subscriberList){
           subs.update();
        }
    }

    public void upload(String title) {
        this.title=title;
        notifySubscriber();
    }
}
