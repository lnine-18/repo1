package com.company.day03;

public class Student extends People {
    private String CLASS;
    private double score,studentid;

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getStudentid() {
        return studentid;
    }

    public void setStudentid(double studentid) {
        this.studentid = studentid;
    }

    public Student(String id, String name, String sex, String CLASS, double score, double studentid) {
        super(id, name, sex);
        this.CLASS = CLASS;
        this.score = score;
        this.studentid = studentid;
    }
    public void introduce(){
        System.out.println("我叫"+this.name);
    }
    public void AttendClass(String course){
        System.out.println("我今天上的课是："+course);
    }
    public void test(String subject){
        System.out.println("我今天要考试的科目是；"+subject);
    }
}
