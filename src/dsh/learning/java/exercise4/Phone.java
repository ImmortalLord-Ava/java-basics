package dsh.learning.java.exercise4;

public class Phone extends Product{
    String brand;
    int storageGB;

    Phone(String name, double price, String brand, int storageGB){
        super(name, price);
        this.brand = brand;
        this.storageGB = storageGB;
    }
    public double getFinalPrice(){
        return getPrice()=getPrice()-200;
    }
    p
}
