package dsh.learning.java.exercise2;

public class Cat extends Animal{
    private String color;
    public Cat(String name, int age, String color){
        super(name, age);
        this.color = color;
    }
    public Cat(){
    }
    public Cat(String name){
        this(name,super.age,"白色");
    }
    public void speak(){
        System.out.println("姓名；" + getName() + "年龄；" + getAge() + "颜色；" + color);
    }
}
