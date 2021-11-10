package com.company.day08.Thread002;

public class ProducerConsumer {
    public static void main(String[] args) {
        Warehouse warehouse=new Warehouse();
        Producer p1=new Producer(warehouse);
        Consumer c1=new Consumer(warehouse);
        p1.start();
        c1.start();
    }
}
