package dsh.learning.java.exercise4;

public class Food extends Product {
    private String expireDate;

    public Food(String name, double price, String expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    /** 食品不打折，但要把保质期写进描述。 */
    @Override
    public String describe() {
        return "保质期 " + expireDate;
    }
}
