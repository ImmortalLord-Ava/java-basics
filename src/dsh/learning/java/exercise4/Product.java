package dsh.learning.java.exercise4;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        //你原来写：System.out.println("\"Product 构造器执行\"");
        //    转义引号会把双引号也打出来，显示成 "Product 构造器执行"
        //改成下面这样：
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

    //你原来写：public double getFinalPrice(){ return totalCount-totalSales; }
    //    问题：父类的最终价就是原价，跟统计数字没关系
    //改成：直接返回 price
    public double getFinalPrice() {
        return price;
    }

    //你原来写：public String describe(){ System.out.println(name price); }
    //    两个问题：① 少了 +，name 和 price 不能直接挨着写
    //             ② 声明是 String 就必须 return，只 println 会报 missing return statement
    //改成：返回拼接好的字符串
    public String describe() {
        return name + " " + price;
    }

    //你原来写：public final String getLabel(){ System.out.println("\"【\" + name + \"】\""); }
    //    问题：把整个拼接塞进了一个字符串里，打印出来就是源码本身；而且没有 return
    //改成：
    public final String getLabel() {
        return "【" + name + "】";
    }
}
