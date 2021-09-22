package com.company.day02;

import jdk.swing.interop.SwingInterOpUtils;

public class Testaccout {
    public static void main(String[] args) {
        Account people1= new Account("001","张三",20000);
        Account people2= new Account("002","李四",50000);
        Account people3= new Account("003","王五",60000);
        people1.deposite(2000);
        people2.withdrow(6000);
        people1.transfer(people2,2500);
        people3.deposite(2000);
        people1.print("张三");
        people2.print("李四");
        people3.print("王五");
        System.out.println("银行账户总额为："+Account.getTotalamount());
    }
}
