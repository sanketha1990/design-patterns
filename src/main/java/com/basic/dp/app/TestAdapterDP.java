package com.basic.dp.app;

import com.basic.dp.adapter.AssignmentWork;
import com.basic.dp.adapter.Pen;
import com.basic.dp.adapter.PenAdapter;

//School class
public class TestAdapterDP {
    public static void main(String[] args) {
        AssignmentWork aw=new AssignmentWork();
    Pen p=new PenAdapter();
    aw.setP(p);
    aw.writeAssignment("I am tired of writing assignment");

    }
}
