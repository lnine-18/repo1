package com.company.day03;

import com.sun.jdi.NativeMethodException;

public class Teacher extends People {
    private String teachernumber,teachertitle,Salarynumber;

    public String getTeachernumber() {
        return teachernumber;
    }

    public void setTeachernumber(String teachernumber) {
        this.teachernumber = teachernumber;
    }

    public String getTeachertitle() {
        return teachertitle;
    }

    public void setTeathertitle(String teachertitle) {
        teachertitle = teachertitle;
    }

    public String getSalarynumber() {
        return Salarynumber;
    }

    public void setSalarynumber(String salarynumber) {
        Salarynumber = salarynumber;
    }

    public Teacher(String id, String name, String sex, String teachernumber, String teachertitle, String salarynumber) {
        super(id, name, sex);
        this.teachernumber = teachernumber;
        teachertitle = teachertitle;
        Salarynumber = salarynumber;
    }
    public void lecture(int num,String course,String course1){
        System.out.println("我今天有"+num+"门课要讲"+"分别是："+course+" "+course1);
    }
    public void mark (String name){
        System.out.println("我今天批改了"+ name +"的试卷");
    }
    public void introduce(){
        System.out.println("我叫"+this.name);
    }
}
