package dsh.learning.java.exercise4;

public class Food extends Product{
    String expireDate;
    Food(String name, double price, String expireDate){
        super(name, price);
        this.expireDate = expireDate;
    }
}
