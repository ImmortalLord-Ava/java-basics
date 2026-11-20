package dsh.learning.java.exercise4;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        System.out.println("Product 构造器执行");
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // 父类的最终价：原价。子类可以重写它
    public double getFinalPrice() {
        return price;
    }

    // 返回字符串，不是打印
    public String describe() {
        return name + " " + price;
    }

    // final：子类不能重写这个方法
    public final String getLabel() {
        return "【" + name + "】";
    }
}
