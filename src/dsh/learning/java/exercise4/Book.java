package dsh.learning.java.exercise4;

public class Book extends Product {
    String author;
    int pages;

    Book(String name, double price, int pages, String author) {
        super(name, price);   // ✅ 这一句你写对了
        this.pages = pages;
        this.author = author;
    }

    // 你原来写：
    //    public double getFinalPrice(){
    //       if(getPrice()>50){
    //           getPrice()=getPrice()*0.8;   // 方法调用放在 = 左边，等于"给值赋值"，编译不过
    //       }
    //    }                                  // 而且声明了 double 却没有 return
    //
    // 改成：算出来的值直接 return，不修改原价
    //    原价 108 永远还是 108，getFinalPrice() 每次都算一次 0.8
    public double getFinalPrice() {
        if (getPrice() > 50) {
            return getPrice() * 0.8;
        }
        return getPrice();
    }

    // 你原来写：public String describe(){ System.out.println(getName() getPrice() author); }
    //    问题：① 少了 +  ② 没有 return
    // 改成：
    public String describe() {
        return getName() + " " + getPrice() + " " + author;
    }
}
