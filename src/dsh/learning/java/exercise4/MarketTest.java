package dsh.learning.java.exercise4;

public class MarketTest {
    public static void main(String[] args) {

        //这一块你写对了：父类数组装三个子类对象
        Product[] cart = {
                new Book("Java 编程思想", 108.0, 880, "Bruce Eckel"),
                new Phone("小米 15", 3999.0, "Xiaomi", 512),
                new Food("泡面", 4.5, "2027-01-01")
        };

        System.out.println("===== 第一步：统一打印 =====");
        for (int i = 0; i < cart.length; i++) {
            //你原来写：System.out.println(getLabel() + describe() + getFinalPrice());
            //    问题：main 是静态方法，不能"光秃秃"地调用实例方法，必须用对象调
            //改成：每个方法前面都加 cart[i].
            System.out.println(cart[i].getLabel()
                    + cart[i].describe()
                    + "  最终价：" + cart[i].getFinalPrice());
        }

        System.out.println("===== 第二步：向下转型 =====");
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] instanceof Book) {
                //这一段你写对了：先判断，再转成 Book，才能用 author / pages
                Book b = (Book) cart[i];
                System.out.println("作者：" + b.author + "  页数：" + b.pages);

            } else if (cart[i] instanceof Phone) {
                //你原来写：((Book) cart[i]).brand
                //    问题：Phone 对象强转成 Book，运行时抛 ClassCastException
                //改成：转成它真正的类型 Phone
                Phone p = (Phone) cart[i];
                System.out.println("品牌：" + p.brand + "  存储：" + p.storageGB + "GB");

            } else if (cart[i] instanceof Food) {
                // 你原来写：}else(cart[i] instanceof Food){
                //    问题：else 后面不能带条件，带条件必须写 else if
                // 而且：System.out.println("保质期；" + expireDate);
                //    expireDate 是 Food 的字段，必须通过对象访问
                // 改成：
                Food f = (Food) cart[i];
                System.out.println("保质期：" + f.expireDate);
            }
        }

        //你原来没有这一段（题目要求第三个循环）
        //补充：用局部变量 sum 累加，不用 static
        System.out.println("===== 第三步：统计总价 =====");
        double sum = 0;
        for (int i = 0; i < cart.length; i++) {
            sum += cart[i].getFinalPrice();   // 多态：每个商品调自己重写后的价格
        }
        System.out.println("共 " + cart.length + " 件，总销售额 " + sum + " 元");
    }
}
