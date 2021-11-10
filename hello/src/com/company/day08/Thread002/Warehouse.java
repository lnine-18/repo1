package com.company.day08.Thread002;

public class Warehouse {
    private int content;
    private boolean available=false;
    public synchronized int get(){
        while(available==false){
            try {
                wait();
            }catch (InterruptedException e){

            }
        }
        available = false;
        notifyAll();
        return content;
    }
    public synchronized void put(int value){
        while (available==true){
            try {
                wait();
            }catch (InterruptedException e){
            }
        }
        content=value;
        available=true;
        notifyAll();
    }
}
