package dsh.learning.java.exercise3;

public class Vehicle {
    private String brand;
    private int wheels = 3;

    public Vehicle(String brand, int wheels){
        System.out.println("Vehicle构造器 brand=... wheels=..");
        this.brand = brand;
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public String getBrand() {
        return brand;
    }
}
