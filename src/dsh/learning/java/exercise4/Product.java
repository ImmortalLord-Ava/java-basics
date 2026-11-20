package dsh.learning.java.exercise4;

public class Product {
    private String name;
    private double price;
    static int totalCount;
    static double totalSales;

    public Product(String name, double price){
        System.out.println("\"Product 构造器执行\"");
        this.name = name;
        this.price = price;
        totalCount++;
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
        String return name + " " + price;//System.out.println(name price);
    }                                    //返回String 就必须 return
    public final String getLabel(){
        return "【" + name + "】";//System.out.println("\"【\" + name + \"】\"");
    }
}
