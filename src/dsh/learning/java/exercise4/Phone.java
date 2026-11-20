package dsh.learning.java.exercise4;

public class Phone extends Product {
    String brand;
    int storageGB;

    Phone(String name, double price, String brand, int storageGB) {
        super(name, price);
        this.brand = brand;
        this.storageGB = storageGB;
    }

    // 重写：以旧换新减 200（同样不修改原价）
    public double getFinalPrice() {
        return getPrice() - 200;
    }

    public String describe() {
        return getName() + " " + getPrice() + " " + brand;
    }
}
