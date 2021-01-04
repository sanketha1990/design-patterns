package com.basic.dp.app;

import com.basic.dp.composite.Composite;
import com.basic.dp.composite.Leaf;

public class TestCompositeDP {
    public static void main(String[] args) {
        Leaf hd=new Leaf(4000,"HDD");
        Leaf mouse=new Leaf(300,"Mouse");
        Leaf monitor=new Leaf(6000,"Monitor");
        Leaf ram=new Leaf(3500,"RAM");
        Leaf cpu=new Leaf(8000,"CPU");

        Composite ph=new Composite("Periferal");
        Composite cabinet=new Composite("Cabinet");
        Composite motherBoard=new Composite("MotherBoard");
        Composite computer=new Composite("Computer");

        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);
        ph.addComponent(mouse);
        ph.addComponent(monitor);
        cabinet.addComponent(hd);
        cabinet.addComponent(motherBoard);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        computer.showPrice();

    }
}
