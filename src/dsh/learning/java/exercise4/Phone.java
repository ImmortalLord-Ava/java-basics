package dsh.learning.java.exercise4;

public class Phone extends Product {
    String brand;
    int storageGB;

    Phone(String name, double price, String brand, int storageGB) {
        super(name, price);
        this.brand = brand;
        this.storageGB = storageGB;
    }

    // 你原来写：public double getFinalPrice(){ return getPrice()=getPrice()-200; }
    //    问题：getPrice() 是方法调用，不能在 = 左边；而且减 200 不该改原价
    //改成：直接返回"原价 - 200"
    public double getFinalPrice() {
        return getPrice() - 200;
    }

    // 你原来写：public String describe(){ System.out.println(getName() getPrice() brand); }
    //    问题：少了 +，而且没有 return
    // 改成：
    public String describe() {
        return getName() + " " + getPrice() + " " + brand;
    }
}
