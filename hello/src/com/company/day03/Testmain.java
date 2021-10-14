package com.company.day03;

public class Testmain {
    public static void main(String[] args) {
        Student s1 = new Student("4211232001","张三","男","六年级三班",58,54321);
        Teacher t1 = new Teacher("4211231985","王二麻子","男","1000x","班主任","5000");
        Police p1 = new Police("4211231999","王五","男","54321","督察部","小组长");
        s1.introduce();
        s1.AttendClass("语文");
        s1.test("数学");
        s1.walk(5000);
        System.out.println("========================");
        t1.introduce();
        t1.mark("张三");
        t1.lecture(2,"语文","数学");
        System.out.println("========================");
        p1.introduce();
        p1.duty();
        p1.training();
    }
}
