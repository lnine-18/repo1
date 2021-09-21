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
        System.out.println("张三的余额为："+people1.getBalance());
        System.out.println("李四的余额为："+people2.getBalance());
        System.out.println("王五的余额为："+people3.getBalance());
        System.out.println("银行账户总额为："+Account.getTotalamount());
    }
}
