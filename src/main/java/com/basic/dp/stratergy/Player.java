package com.basic.dp.stratergy;

public class Player {

    private IStratergy behavior;
    private String type;

    public Player(String type){
        this.type=type;
    }
    public void setStrategy(IStratergy behavior){
        this.behavior=behavior;
    }
    public void action(){
        System.out.println("Player  "+type);
        behavior.actionCommand();
    }
}
