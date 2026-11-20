package dsh.learning.java.exercise4;

public class MarketTest {
    public static void main(String[] args) {
        Product[] cart = {
                new Book("Java 编程思想", 108.0, 880, "Bruce Eckel"),
                new Phone("小米 15", 3999.0, "Xiaomi", 512),
                new Food("泡面", 4.5, "2027-01-01")
        };
        for (int i = 0; i < cart.length; i++) {
            System.out.println(getLabel() + describe() + getFinalPrice());
            if(cart[i] instanceof Book){
                System.out.println("作者：" + ((Book) cart[i]).author +"页数；" + ((Book) cart[i]).pages);
            } else if (cart[i] instanceof Phone) {
                System.out.println("品牌；" + ((Book) cart[i]).brand + "存储；" + ((Book) cart[i]).storageGB);
            }else//(cart[i] instanceof Food)else 后面不能带条件{
                System.out.println("保质期；" + expireDate);
            }
            }
        }

}
