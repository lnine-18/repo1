package com.company.day02;

import jdk.swing.interop.SwingInterOpUtils;

public class Teststudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(18);
        System.out.println("姓名：" + stu1.getName());
        System.out.println("年龄：" + stu1.getAge());
        Student stu2 = new Student("王五", 21);
        System.out.println("姓名：" + stu2.getName() + ",年龄:" + stu2.getAge());
        stu2.setAge(35);
        System.out.println("姓名："+stu2.getName()+"，年龄"+stu2.getAge());
    }
}
