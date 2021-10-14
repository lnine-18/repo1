package com.company.day03;

public class People {
    public String id,name,sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public People() {
    }

    public People(String id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }
    public void eat(){
        System.out.println("吃饭啊");
    }
    public void sleep(int time){
        System.out.println("我今天睡了"+time+"个小时");
    }

    public void walk(int distance) {
        System.out.println("我今天走了"+distance+"米");
    }
}
