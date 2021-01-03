package com.basic.dp.app;

import com.basic.dp.stratergy.AgressiveStratergy;
import com.basic.dp.stratergy.DefensiveStrategy;
import com.basic.dp.stratergy.Player;

public class TestStratergyDP {
    public static void main(String[] args) {
    Player terrorist=new Player("Terrorist");
    Player counter_terrorist=new Player("Counter Terrorist");

    System.out.println("Before the bomb is planted !");
    terrorist.setStrategy(new AgressiveStratergy());
    counter_terrorist.setStrategy(new DefensiveStrategy());

    terrorist.action();
    counter_terrorist.action();

    System.out.println("After bomb is planted !");
    terrorist.setStrategy(new DefensiveStrategy());
    counter_terrorist.setStrategy(new AgressiveStratergy());

    terrorist.action();
    counter_terrorist.action();

    }
}
