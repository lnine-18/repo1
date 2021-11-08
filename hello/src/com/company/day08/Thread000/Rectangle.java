package com.company.day08.Thread000;

public class Rectangle {
    private volatile int x,y;

    public  void increase() {
        x++;
        y++;
    }
    public  void print(){
        System.out.println("x="+x+" y="+y);
    }
}
