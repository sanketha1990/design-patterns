package com.basic.dp.composite;

public class Leaf implements IComponent {
    private int price;
    private String name;
    public void showPrice() {
        System.out.println(name+" : "+price);
    }
    public Leaf(int price,String name){
        this.price=price;
        this.name=name;
    }
}
