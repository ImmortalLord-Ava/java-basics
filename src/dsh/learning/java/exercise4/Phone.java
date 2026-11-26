package dsh.learning.java.exercise4;

public class Phone extends Product {
    private String brand;
    private int storageGB;

    public Phone(String name, double price, String brand, int storageGB) {
        super(name, price);
        this.brand = brand;
        this.storageGB = storageGB;
    }

    public String getBrand() {
        return brand;
    }

    public int getStorageGB() {
        return storageGB;
    }

    /** 一律减 200。同样只影响返回值，不修改 price。 */
    @Override
    public double getFinalPrice() {
        return getPrice() - 200;
    }

    @Override
    public String describe() {
        return "品牌 " + brand + " 存储 " + storageGB + "GB";
    }
}
