package com.basic.dp.composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent{
    private String name;
    List<IComponent> componentList=new ArrayList<IComponent>();
    public void showPrice() {
        System.out.println(name);
        for(IComponent comp:componentList){
            comp.showPrice();
        }
        System.out.println();
    }
    public Composite(String name){
        super();
        this.name=name;
    }
    public void addComponent(IComponent component){
        componentList.add(component);
    }
}
