package dsh.learning.java.exercise4;

public class MarketTest {
    public static void main(String[] args) {

        // 父类数组装三个子类对象（多态）
        Product[] cart = {
                new Book("Java 编程思想", 108.0, 880, "Bruce Eckel"),
                new Phone("小米 15", 3999.0, "Xiaomi", 512),
                new Food("泡面", 4.5, "2027-01-01")
        };

        System.out.println("===== 第一步：统一打印 =====");
        for (int i = 0; i < cart.length; i++) {
            // 同一个方法名，走的是各自重写后的版本
            System.out.println(cart[i].getLabel()
                    + cart[i].describe()
                    + "  最终价：" + cart[i].getFinalPrice());
        }

        System.out.println("===== 第二步：向下转型 =====");
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] instanceof Book) {
                Book b = (Book) cart[i];              // 向下转型，才能用 Book 独有的字段
                System.out.println("作者：" + b.author + "  页数：" + b.pages);
            } else if (cart[i] instanceof Phone) {
                Phone p = (Phone) cart[i];            // 这里必须是 Phone，不是 Book
                System.out.println("品牌：" + p.brand + "  存储：" + p.storageGB + "GB");
            } else if (cart[i] instanceof Food) {
                Food f = (Food) cart[i];
                System.out.println("保质期：" + f.expireDate);
            }
        }

        System.out.println("===== 第三步：统计总价 =====");
        double sum = 0;
        for (int i = 0; i < cart.length; i++) {
            sum += cart[i].getFinalPrice();
        }
        System.out.println("共 " + cart.length + " 件，总销售额 " + sum + " 元");
    }
}
