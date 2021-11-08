package com.company.day08.Thread000;

public class ThreadIncrease extends Thread{
     Rectangle rectangle;
    public ThreadIncrease(Rectangle rectangle){
        this.rectangle=rectangle;
    }
    public void run(){
        for (int i = 0; i < 1000000; i++) {
            rectangle.increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Rectangle rectangle=new Rectangle();
        ThreadIncrease t1=new ThreadIncrease(rectangle);
        ThreadIncrease t2=new ThreadIncrease(rectangle);
        t1.start();
        t2.start();
        for (int i = 0; i < 5; i++) {
            rectangle.print();
            Thread.sleep(5);
        }
    }
}
