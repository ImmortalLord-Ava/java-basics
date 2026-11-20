package dsh.learning.java.exercise4;

public class Product {
    private String name;
    private double price;
    static int totalCount;
    static double totalSales;

    public Product(String name, double price){
        System.out.println("\"Product 构造器执行\"");
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public double getFinalPrice(){
        return price;
    }
    public String describe(){
        System.out.println("\"name price\"");
    }
    public
}
