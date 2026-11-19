package com.dsh.learning.java.exercise;

public class Student extends Person {
    private String no;
    private String major;

    public Student(String name, int age, String no, String major) {
        super(name, age);
        System.out.println("Student 构造器执行");
        this.no = no;
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public String getNo() {
        return no;
    }

    @Override
    public void say() {
        System.out.println("姓名：" + getName() + "  年龄：" + getAge() + "  学号：" + no + "  专业：" + major);
    }
}
