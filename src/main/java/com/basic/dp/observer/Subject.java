package com.basic.dp.observer;

public interface Subject {
    void subscriber(IObserver subscriber);
    void unSubscribe(IObserver subscriber);
    void notifySubscriber();
    void upload(String title);
}
