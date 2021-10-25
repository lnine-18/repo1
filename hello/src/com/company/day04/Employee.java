package com.company.day04;

public class Employee implements Comparable {
    private String name;
    private int age ;
    private double salary;

    @Override
    public  int compareTo(Object o) {
        Employee emp = (Employee)o;
        if(this.salary!= emp.salary){
            return(int)(this.salary-salary);
        }
        if (this.age!=age){
            return this.age-age;
        }
        return this.name.compareTo(emp.name);
    }

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
