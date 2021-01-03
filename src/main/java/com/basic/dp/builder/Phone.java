package com.basic.dp.builder;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@AllArgsConstructor
@ToString
public class Phone {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

}
