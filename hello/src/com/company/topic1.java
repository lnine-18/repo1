package com.company;

import java.util.Scanner;

public class topic1 {
        public static void main (String[] args){
            int a=0,b;
            System.out.println("请分别输入两个整数a,b");
            Scanner scanner=new Scanner(System.in);
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            if(y>x)a=x;x=y;y=a;
            while((b=x%y)!=0)
            {
                x=y;
                y=b;
            }
            System.out.println("最大公因数y="+y);
        }

    }

