package dsh.learning.java.demo;

/*
 * ============================================================
 *  构造器执行顺序 · 示例 1/3 —— 父类 Animal
 * ============================================================
 *
 *  【你必须记住的一条】
 *  任何构造器的第一件事，永远是 super(...)。
 *  你写了就是执行你写的那个；你没写，编译器自动插一句 super();
 *
 *  【对象创建的四步】
 *    第 1 步：分配内存，所有字段 = 默认值（int 是 0，String 是 null）
 *    第 2 步：执行 super(...) —— 父类的字段初始化 + 父类构造器体
 *    第 3 步：执行本类的字段初始化（就是下面 legs = 4 这种）
 *    第 4 步：执行本类构造器体（大括号里的代码）
 *
 *  【易错点 ★1】字段初始化（= 4）不是"声明时就生效"，
 *              它排在上面的第 3 步，比 super(...) 晚。
 */
public class Animal {

    // ★易错点1：这个 = 4 属于"第 3 步"，不是第 1 步
    private int legs = 4;

    private String name;
    private int age;

    // 父类只有这一个带参构造器 → 子类必须写 super(name, age)
    // 如果这里再加一个 public Animal() {}，子类就能不写 super(...) 了，为什么？？？？？？
    public Animal(String name, int age) {

        // 【易错点 ★2】此刻 legs 已经等于 4 了（第 3 步已完成）
        // 但这是在"父类构造器里面"，还没回到子类
        System.out.println("  [3] Animal 构造器体 开始   legs=" + legs + " (字段初始化已完成)");

        this.name = name;
        this.age = age;

        System.out.println("  [3] Animal 构造器体 结束   name=" + name + "  age=" + age);
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getLegs() { return legs; }

    public void speak() {
        System.out.println("我是 " + name + "，年龄 " + age + "，腿 " + legs + " 条");
    }
}