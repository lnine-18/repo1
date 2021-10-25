package com.company.day04;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.util.Arrays;

public class Recursive01 {
    public static void main(String[] args) {
        File file = new File("D:\\aaa");
        System.out.println("==================");
        getallfile(file);
    }

    public static void getallfile(File n) {
        System.out.println(n);
        File[] files = n.listFiles();
        for (File a : files) {
            if (a.isDirectory()) {
                getallfile(a);
               // System.out.println(a);
            }
            if (a.isFile()) {
                System.out.println(a);
            }
        }
    }
}
