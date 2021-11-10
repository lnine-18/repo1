package com.company.day08.Thread001;

public class FirstThread extends Thread{
    private String name;

    public FirstThread(String name) {
        super(name);
        this.name = name;
        System.out.println(name+"创建成功");
    }
    public void run (){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "第" + i + "次运行");
            Thread.yield();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FirstThread t1=new FirstThread("第一个线程");
        FirstThread t2=new FirstThread("第二个线程");
        FirstThread t3=new FirstThread("第三个线程");
        FirstThread t4=new FirstThread("第四个线程");
        FirstThread t5=new FirstThread("第五个线程");
        System.out.println("开始启动线程");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        System.out.println("main方法执行完毕");
    }
}
