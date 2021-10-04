package com.company.day03;

public class Comparetime {
    public static void main(String[] args) {
        String s1 = new String("a");
        StringBuffer s2 = new StringBuffer("d");
        long starTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s1 += "b";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间 " + (endTime - starTime) + " ms");
        long starTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            StringBuffer s3 = s2.append("f");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("程序运行时间 "+(endTime1-starTime1)+" ms");
    }
}
