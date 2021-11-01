package com.company.day04;
import java.io.File;


public class Recursive01 {
    public static void main(String[] args) {
        File file = new File("D:\\aaa");
        System.out.println("==================");
        GetAllFile(file);
    }

    public static void GetAllFile(File n) {
        System.out.println(n);
        File[] files = n.listFiles();
        for (File a : files) {
            if (a.isDirectory()) {
               GetAllFile(a);
            }
            if (a.isFile()) {
                System.out.println(a);
            }
        }
    }
}
