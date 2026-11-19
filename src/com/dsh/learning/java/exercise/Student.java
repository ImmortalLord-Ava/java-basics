package com.dsh.learning.java.exercise;

public class Student extends Person{
    private String no;
    private String major;
    public Student(String name, int age,String no, String major){
        super();
        this.major=major;
        this.no=no;
        System.out.println(this("1000","计算机科学与技术"));
    }
    //可以直接调用构造器吗，同一个类里面。                  //如果子类没有对应两个参的构造器，就会找父类的？还是报错呢？
  // System.out.println(this("1000","计算机科学与技术"));为啥写构造器外面就不能用了。

    public String getMajor() {
        return major;
    }
    public String getNo() {
        return no;
    }
    public void say(){
        System.out.println("姓名；" + getName(),"年龄；" + getAge(),"学号；" + no,"专业；" + major);
    }
}

