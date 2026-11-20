package dsh.learning.java.exercise3;

public class Car extends Vehicle{
    private String color = "透明";
    public Car(String brand, int wheels, String color){
        System.out.println("Car三参 color=" + color);
        super(brand, wheels);
        this.color = color;
    }
    public Car(String brand){
        this(brand,4,"黑色");
    }
    public void show(){
        System.out.println("");
    }
}
