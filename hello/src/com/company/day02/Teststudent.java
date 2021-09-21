package com.company.day02;

import jdk.swing.interop.SwingInterOpUtils;

public class Teststudent {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("张三");
        stu.setAge(18);
        stu.setMale(true);

        System.out.println("姓名："+stu.getName());
        System.out.println("年龄："+stu.getAge());
        System.out.println("是不是男生："+stu.isMale());

    }
}
