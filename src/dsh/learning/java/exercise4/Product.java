package dsh.learning.java.exercise4;

public class Product {
    private String name;
    private double price;
    static int totalCount;
    static double totalSales;

    public Product(String name, double price){
        System.out.println("Product 构造器执行");
    }
}
