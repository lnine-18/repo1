package com.company.day03;

public class Police extends People{
    private  String  policenumber,department,policetitle;

    public Police(String id, String name, String sex, String policenumber, String department, String policetitle) {
        super(id, name, sex);
        this.policenumber = policenumber;
        this.department = department;
        this.policetitle = policetitle;
    }

    public String getPolicenumber() {
        return policenumber;
    }

    public void setPolicenumber(String policenumber) {
        this.policenumber = policenumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPolicetitle() {
        return policetitle;
    }

    public void setPolicetitle(String policetitle) {
        this.policetitle = policetitle;
    }
    public void introduce(){
        System.out.println("我叫"+this.name);
    }
    public void duty(){
        System.out.println("今天要执勤");
    }
    protected void training (){
        System.out.println("有训练任务");
    }

}
