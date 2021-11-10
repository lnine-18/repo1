package com.company.day08.Thread002;

public class Consumer extends Thread{
    private Warehouse warehouse;
    public Consumer(Warehouse warehouse){
        this.warehouse=warehouse;
    }
    public void run(){
        int value=0;
        for (int i = 1; i <= 10; i++) {
            value=warehouse.get();
            System.out.println("Consumer   got:"+value);
        }
    }
}
