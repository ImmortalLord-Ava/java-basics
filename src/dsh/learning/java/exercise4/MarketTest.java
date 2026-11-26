package dsh.learning.java.exercise4;

public class MarketTest {
    public static void main(String[] args) {

        // 父类数组装三个子类对象：这就是多态的前提
        Product[] cart = {
                new Book("Java 编程思想", 108.0, 880, "Bruce Eckel"),
                new Phone("小米 15", 3999.0, "Xiaomi", 512),
                new Food("泡面", 4.5, "2027-01-01")
        };

        System.out.println("===== 第一步：统一打印 =====");
        // 直接打印对象 = 调用它的 toString()
        // 优化点：不用再写 getLabel() + describe() + getFinalPrice() 三段拼接
        for (Product p : cart) {
            System.out.println(p);
        }

        System.out.println("===== 第二步：向下转型 =====");
        // 先判断 instanceof，确认是哪个子类，再转型去用子类特有的字段/方法
        for (Product p : cart) {
            if (p instanceof Book) {
                Book b = (Book) p;
                System.out.println("书名：" + b.getName() + " 作者：" + b.getAuthor() + " 页数：" + b.getPages());
            } else if (p instanceof Phone) {
                Phone ph = (Phone) p;
                System.out.println("机型：" + ph.getName() + " 品牌：" + ph.getBrand() + " 存储：" + ph.getStorageGB() + "GB");
            } else if (p instanceof Food) {
                Food f = (Food) p;
                System.out.println("食品：" + f.getName() + " 保质期：" + f.getExpireDate());
            }
        }

        System.out.println("===== 第三步：统计总价 =====");
        double sum = 0;
        for (Product p : cart) {
            sum += p.getFinalPrice();   // 多态：每个商品走自己的最终价
        }
        System.out.println("共 " + cart.length + " 件，总销售额 " + String.format("%.2f", sum) + " 元");
    }
}
