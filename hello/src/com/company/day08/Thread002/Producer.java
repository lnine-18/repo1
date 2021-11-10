package com.company.day08.Thread002;

public class Producer extends Thread{
    private Warehouse warehouse;
    public Producer(Warehouse warehouse){
        this.warehouse=warehouse;
    }
    public void run(){
        for (int i = 1; i <= 10; i++) {
            warehouse.put(i);
            System.out.println("Producer  put:"+i);
            try{
                sleep(100);
            }catch (InterruptedException e){

            }
        }
    }
}
