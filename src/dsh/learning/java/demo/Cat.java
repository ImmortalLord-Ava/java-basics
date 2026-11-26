package dsh.learning.java.demo;

/*
 * ============================================================
 *  构造器执行顺序 · 示例 2/3 —— 子类 Cat
 * ============================================================
 *
 *  【你的三个真实报错，都在这个文件里复现】
 *  ① this(color, ...)            -> reference to color may only appear after an explicit constructor invocation
 *  ② this(getColor(), ...)       -> reference to getColor() may only appear after ...
 *  ③ this(name, age, "白色")     -> age has private access in Animal
 *
 *  这三条的共同原因：
 *  ★ 在写 this(...) / super(...) 的那一行，对象还是半成品，实例成员一律不能碰。
 */
public class Cat extends Animal {

    // ★易错点3：这行 = "未设置" 属于"第 4 步"（本类字段初始化），
    //           它发生在 super(...) 之后，不是在声明时就生效
    private String color = "未设置";

    // ============================================================
    //  构造器①：三个参数（子类的主构造器）
    // ============================================================
    public Cat(String name, int age, String color) {

        // 【第 2 步】调用父类构造器 —— 必须是第一句
        // 父类只有 Animal(String,int)，所以这里必须传两个参数
        super(name, age);

        // 【第 4 步】到这里，本类字段初始化已完成（color 已经是 "未设置"）
        System.out.println("  [4] Cat 三参构造器体 开始   color=" + this.color);

        this.color = color;

        System.out.println("  [4] Cat 三参构造器体 结束   color=" + color);
    }

    // ============================================================
    //  构造器②：一个参数 —— 演示 this(...) 串联
    // ============================================================
    public Cat(String name) {

        // this(...) 也是必须是第一句，它会转到本类另一个构造器
        // 转过去以后，super(...) 在那边执行
        this(name, 0, "白色");

        System.out.println("  [5] Cat(String) 构造器体 执行完");
    }

    // ============================================================
    //  ★★★ 下面这些是被注释掉的错误写法，你可以自己取消注释看报错 ★★★
    // ============================================================

    /*
    // 错误①：this(...) 里写了本类字段 color
    // 报错：reference to color may only appear after an explicit constructor invocation
    public Cat(int n) {
        this(color, 0, "白色");
    }
    */

    /*
    // 错误②：this(...) 里调了实例方法 getColor()
    // 报错：reference to getColor() may only appear after an explicit constructor invocation
    public Cat(long l) {
        this(getColor(), 0, "白色");
    }
    */

    /*
    // 错误③：this(...) 里写了父类字段 age（name 是参数没问题，age 不是）
    // 报错：age has private access in Animal
    public Cat(double d) {
        this(name, age, "白色");
    }
    */

    /*
    // 错误④：一个构造器都不写 super(...)，父类又没有无参构造器
    // 报错：constructor Animal in class Animal cannot be applied to given types;
    //       required: String,int   found: no arguments
    // 原因：编译器会自动补一句 super(); 但父类没有 Animal()
    public Cat(boolean b) {
        System.out.println("没写 super");
    }
    */

    /*
    // 错误⑤：@Override 标在本类没有继承来的方法上
    // 报错：method does not override or implement a method from a supertype
    @Override
    public void walk() {
    }
    */

    // ============================================================
    //  ✅ 合法写法示例（括号里只放"此刻就能算出值"的东西）
    // ============================================================

    // ✅ 参数
    public Cat(String name, int age) {
        this(name, age, "黑色");
    }

    // ✅ 参数 + 计算
    public Cat(String name, int age, int colorCode) {
        this(name, age + 1, colorCode > 0 ? "有色" : "无色");
    }

    // ✅ static 方法（不依赖对象，随时能算）
    static String defaultColor() { return "白色"; }

    public Cat(String name, char c) {
        this(name, 0, defaultColor());
    }

    // ============================================================
    //  普通方法：★易错点4 —— 这里可以用 this.color / getColor()
    //  因为方法执行时，对象早就构造完了
    // ============================================================
    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    @Override
    public void speak() {
        System.out.println("我是猫 " + getName() + "，年龄 " + getAge()
                + "，颜色 " + color);
    }
}