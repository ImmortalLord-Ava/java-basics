package com.dsh.learning.java.exercise;

public class Teacher extends Person{
    private String title;
    public Teacher(String name, int age,String title){
        super("王五",40);
        this.title=title;
    }

    public String getTitle() {
        return title;
    }
    public void say(){
        System.out.println("姓名；" + getName(),"年龄；" + getAge(),"职称；" + title);
    }
}
