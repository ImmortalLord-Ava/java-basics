package com.dsh.learning.java.exercise;

public class SchoolTest {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",20,"5001","计算机");
        Student stu2 = new Student("李四", 21,"5002","软件工程");//如果是左边没写Person的话，也是可以用重写的方法吧。构造器还是会正常
        Teacher tea = new Teacher("王五",40,"教授");//正常调用吧。那这里还需要多态吗？
        Person[] arr = new Person[stu1, stu2, tea];
        //这能直接存入数组吗，类型都不对吧。这咋存。
        for (int i = 0; i < 3; i++) {
            arr[i]. public void say ();
        }
        if (stu1 instanceof Person) {
            System.out.println("学号是；" + stu1.getNo());
        }
        if (stu2 instanceof Person) {
            System.out.println("学号是；" + stu2.getNo());
        }
        if (tea instanceof Person) {
            System.out.println("职称是；" + tea.getTitle());

        }
        arr[0].idCard();
        System.out.println(arr[0].type);
    }
    }
