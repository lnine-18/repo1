package com.company.day06;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TopM {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            list1.add(random.nextInt());
        }
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) list1.get(i);
        }


    }
}

