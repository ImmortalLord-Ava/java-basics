package dsh.learning.java.demo;

/*
 * ============================================================
 *  构造器执行顺序 · 示例 3/3 —— 运行入口
 * ============================================================
 *
 *  【回答你的问题】是不是程序运行都先执行 super(...)？
 *
 *  是。任何构造器的第一件事永远是 super(...)：
 *    - 你写了 super(x, y)  -> 执行你写的那个父类构造器
 *    - 你写了 this(x, y)   -> 先转本类另一个构造器，那边再 super(...)
 *    - 你什么都没写        -> 编译器自动补一句 super();
 *                            如果父类没有无参构造器，就编译报错（见 Cat.java 错误④）
 *
 *  【四步顺序】
 *    第1步 分配内存，字段 = 默认值（0 / null / false）
 *    第2步 super(...)  —— 父类字段初始化 + 父类构造器体
 *    第3步 本类字段初始化（= 右边那些值，如 legs = 4、color = "未设置"）
 *    第4步 本类构造器体
 */
public class DemoMain {

    static void head(String t) {
        System.out.println();
        System.out.println("========== " + t + " ==========");
    }

    static void note(String t) {
        System.out.println("      " + t);
    }

    public static void main(String[] args) {

        // ======================================================
        //  示例 A：三个参数的构造器（直接 super）
        // ======================================================
        head("示例 A：new Cat(\"咪咪\", 2, \"橘色\")");

        note("[1] 分配内存，所有字段 = 默认值：legs=0, name=null, age=0, color=null");
        note("[2] 进入 Cat(String,int,String)，第一句是 super(name, age)");
        note("    → 跳到父类 Animal");

        Cat c1 = new Cat("咪咪", 2, "橘色");

        note("→ 回到 Cat，继续执行第 4 步");
        note("✔ 对象构造完成：name=" + c1.getName() + " age=" + c1.getAge()
                + " legs=" + c1.getLegs() + " color=" + c1.getColor());

        // ======================================================
        //  示例 B：一个参数的构造器（this 串联）
        // ======================================================
        head("示例 B：new Cat(\"小橘\")");

        note("[1] 分配内存，字段 = 默认值");
        note("[2] 进入 Cat(String)，第一句是 this(name, 0, \"白色\")");
        note("    → 跳到本类 Cat(String,int,String)");

        Cat c2 = new Cat("小橘");

        note("→ 回到 Cat(String)，继续执行第 5 步");
        note("✔ 对象构造完成：name=" + c2.getName() + " color=" + c2.getColor());

        // ======================================================
        //  示例 C：构造完成之后，才允许用字段和 this
        // ======================================================
        head("示例 C：构造完成之后调用方法");

        // ★关键对比：这里的 this.color / getColor() 都能用，
        //   因为它已经不在构造器里了，对象早就成形
        c1.speak();
        c2.speak();
        c2.setColor("橘色");
        System.out.println("  改完颜色：" + c2.getColor());

        // ======================================================
        //  总结
        // ======================================================
        head("总结（背下来）");
        System.out.println("  1. 任何构造器第一句，永远是 super(...)（隐式或显式）");
        System.out.println("  2. this(...) 和 super(...) 不能同时出现在同一个构造器里");
        System.out.println("  3. 这两个调用的括号里，只能放：参数、字面量、计算、static 方法");
        System.out.println("  4. 不能放：本类/父类的实例字段、实例方法（对象还没成形）");
        System.out.println("  5. 字段初始化（= 4 这种）排在 super(...) 之后、构造器体之前");
    }
}