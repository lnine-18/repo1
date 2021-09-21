package com.company.day02;

public class Account{
    private String id,name;
    private double balance;
    private static double totalamount;

    public static double getTotalamount() {
        return totalamount;
    }

    public static void setTotalamount(double totalamount) {
        Account.totalamount = totalamount;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public Account() {
        this.id="";
        this.name="";
        this.balance=0;
    }
    public void deposite(double money) {
        this.balance = this.balance + money;
        this.totalamount=this.totalamount+this.balance;
    }
    public void withdrow(double money){
        if(this.balance<money){
            System.out.println("余额不足，无法取钱");
        }
        this.balance=this.balance-money;
        this.totalamount=this.totalamount+this.balance;
    }
    public void transfer(Account other,double money){
        if(this.balance<money){
            System.out.println("余额不足，转账失败");
        }
        this.balance=this.balance-money;
        other.balance=other.balance+money;
    }
    public void print( String who){
        System.out.println("账号："+ id +"户名："+"name"+"余额："+balance);
    }
}
