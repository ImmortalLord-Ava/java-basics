package dsh.learning.java.exercise4;

public class Book extends Product {
    private int pages;
    private String author;

    public Book(String name, double price, int pages, String author) {
        super(name, price);
        this.pages = pages;
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    /** 满 50 打 8 折。注意：只算折扣，不改原价。 */
    @Override
    public double getFinalPrice() {
        if (getPrice() > 50) {
            return getPrice() * 0.8;
        }
        return getPrice();
    }

    @Override
    public String describe() {
        return "作者 " + author + " 页数 " + pages;
    }
}
