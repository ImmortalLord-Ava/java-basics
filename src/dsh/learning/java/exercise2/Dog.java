package dsh.learning.java.exercise2;

public class Dog extends Animal{
    private String breed;
    Dog(String name, int age, String breed){
        super(name,age);
        this.breed = breed;
    }
    public void speak(){
        System.out.println("姓名；" + getName() + "年龄；" + getAge() + "种类；" + breed);
    }
}
