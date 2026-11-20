package dsh.learning.java.exercise2;

public class Cat extends Animal{
    private String color;
    Cat(String name, int age, String color){
        super(name, age);
        this.color = color;
    }
    public void speak(){
        System.out.println("姓名；" + getName() + "年龄；" + getAge() + "颜色；" + color);
    }
}
