package com.company.day08.Thread003;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MakeNumber extends JFrame {
    class Mylabel extends JLabel implements Runnable{
       volatile boolean isRun=false;
       int number=0;
       public void setIsRun(boolean isRun){
           this.isRun=isRun;
       }
       public Mylabel(String number){
           this.setText(number);
           this.setFont(new Font("黑体", Font.BOLD,40));
           this.setForeground(Color.BLUE);
       }

        @Override
        public void run() {
           while (isRun){
               number=(int)(Math.random()*10);
               this.setText(String.valueOf(number));
               try {
                   Thread.sleep(1000);
               }catch (InterruptedException e){
                   e.printStackTrace();
               }
           }

        }
    }
    Mylabel[] number=new Mylabel[6];
    JButton btnStart=new JButton("开始");
    JButton btnEnd=new JButton("结束");
    Thread[] t=new Thread[6];
    public MakeNumber(){
        super("摇号程序");
        JPanel p=new JPanel();
        for (int i = 0; i < 6; i++) {
            number[i]=new Mylabel("0");
            p.add(number[i]);
        }
        p.add(btnStart);
        p.add(btnEnd);
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 6; i++) {
                    t[i]=new Thread(number[i]);
                    number[i].setIsRun(true);
                    t[i].start();
                }
            }
        });
        btnEnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 6; i++) {
                    number[i].setIsRun(false);
                }
            }
        });
        this.add(p,BorderLayout.CENTER);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,100);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        MakeNumber makeNumber=new MakeNumber();
    }


}
