package dsh.learning.java.exercise4;

/**
 * 商品父类。
 *
 * 你这一版踩过的坑（留档，方便复习）：
 *   1. 声明 String 的方法必须 return，只 println 会报 missing return statement
 *   2. 字符串拼接漏了 + 号：name price 不是"两个值"，是一堆语法错误
 *   3. getPrice() 是方法调用，不能放在 = 左边（getPrice() = ... 编译不过）
 *   4. 原价不要被改：打折只影响返回值，不影响 price 字段
 */
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        System.out.println("Product 构造器执行");
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    /** 最终价：父类原价不打折，子类按自己的规则重写。 */
    public double getFinalPrice() {
        return price;
    }

    /** 各自特有的信息，父类只给"名称 原价"。 */
    public String describe() {
        return name + " 原价 " + price;
    }

    /** final：所有商品的前缀格式固定，子类不许改。 */
    public final String getLabel() {
        return "【" + name + "】";
    }

    /** 一行打印用，价格统一保留两位小数（%.2f）。 */
    @Override
    public String toString() {
        return getLabel() + " " + describe() + " 最终价 " + String.format("%.2f", getFinalPrice());
    }
}
