package dsh.learning.java.exercise2;

public class Animal {
    private String name;
    private int age;
    Animal(){

    }
    Animal(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Animal创建");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void speak(){
        System.out.println("姓名；" + name + "年龄；" + age);
    }
}
