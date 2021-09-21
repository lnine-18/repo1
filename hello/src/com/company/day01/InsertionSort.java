package com.company.day01;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a ={2,5,8,1,9};
        int j,t;
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]) {
                t = a[i];
                for (j = i - 1; j >= 0 && a[j] > t; j--) {
                    a[j + 1] = a[j];
                }
                a[j + 1] = t;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}
