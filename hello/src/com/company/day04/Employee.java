package com.company.day04;

public class Employee implements Comparable<Employee>{
    private String name;
    private int age ;
    private double salary;

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

    @Override
    public int compareTo(Employee o) {
        if(this.getSalary()!=o.getSalary()){
            return (int) (this.getSalary()-o.getSalary());
        }if (this.getSalary()==o.getSalary()&&this.getAge()!=o.getAge()){
            return this.getAge()-o.getAge();
        }
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

