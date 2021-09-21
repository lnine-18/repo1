package com.company.day01;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三角形的三边：");
        a= sc.nextDouble();
        b= sc.nextDouble();
        c= sc.nextDouble();
        testTriangle angle=new testTriangle(a,b,c);
        if(angle.istriangle()){
            System.out.println("周长"+angle.peretriangle());
            System.out.println("面积"+angle.areatriangle());
        }else  System.out.println("错误");
    }
}
class testTriangle{
    private double a,b,c;
    public testTriangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public boolean istriangle(){
        if((a+b)>c&&(a+c>b)&&(b+c)>a){
            return true;
        }
        else return false;
    }
    public double peretriangle(){
        return a + b + c;
    }

    public double areatriangle(){
        double area,temp;
        temp=0.5*(a+b+c);
        area= Math.sqrt(temp*(temp-a)*(temp-b)*(temp-c));
        return area;
    }
}


