package com.company;

import java.util.Scanner;

public class topic {

    public static void test(){
        Scanner scan = new Scanner(System.in);
        int year=scan.nextInt();
        int a=0;
        int temp = year+100;
        for(;year<temp;year++){
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        a++;
                    }
                }else{
                    a++;
                }
            }
        }
        System.out.println(a);
    }
}
