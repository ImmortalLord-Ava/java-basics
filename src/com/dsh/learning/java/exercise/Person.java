package com.dsh.learning.java.exercise;

public class Person {
    private String name;
    private int age;
    public String type = "人";
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void say(){
        System.out.println("姓名：" + name + "年龄：" + age);
    }
    public final void idCard(){
        System.out.println("我是本校人员");
    }
}
