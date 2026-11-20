package dsh.learning.java.exercise4;

public class Book extends Product {
    String author;
    int pages;

    Book(String name, double price, int pages, String author) {
        super(name, price);
        this.pages = pages;
        this.author = author;
    }

    // 重写：超过 50 打 8 折（不修改原价，只返回算好的值）
    public double getFinalPrice() {
        if (getPrice() > 50) {
            return getPrice() * 0.8;
        }
        return getPrice();
    }

    public String describe() {
        return getName() + " " + getPrice() + " " + author;
    }
}
