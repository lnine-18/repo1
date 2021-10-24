package com.company.day03;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Comparetime {
    static String s1 = new String("a");
    static StringBuffer s2 = new StringBuffer("d");
    public static void main(String[] args) {
        System.out.println("请输入次数");
        Scanner sc=new Scanner(System.in);
        Comparetime.method(sc.nextInt());
        }
       public static void method(int num){
           long starTime = System.currentTimeMillis();
           for (int i = 0; i < num; i++) {
               s1 += "b";
           }
           long endTime = System.currentTimeMillis();
           System.out.println("程序运行时间 " + (endTime - starTime) + " ms");
           long starTime1 = System.currentTimeMillis();
           for (int i = 0; i < num; i++) {
               StringBuffer s3 = s2.append("f");
           }
           long endTime1 = System.currentTimeMillis();
           System.out.println("程序运行时间 "+(endTime1-starTime1)+" ms");
       }
    }

