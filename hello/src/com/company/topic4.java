package com.company;

import java.util.Random;

public class topic4 {
    public static void main(String[] args) {
        Random random = new Random();
        int rand;
        int sum = 0;
        int aver = 0;
        int[] a = new int[50];
        for (int i = 0; i < 20; i++) {
            rand=random.nextInt(459-77+1)+77;
            a[i] = rand;
        }
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        aver = sum/a.length;
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < 20;i++) {
            if (max < a[i]) max = a[i];
            if (min > a[i]) min = a[i];
        }
            System.out.println("最大值：" + max);
            System.out.println("最小值：" + min);
            System.out.println("元素和：" + sum);
            System.out.println("平均值：" + aver);

    }
}