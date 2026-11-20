package dsh.learning.java.exercise3;

/*
 * ============================================================
 *  构造器执行顺序 · 总结
 * ============================================================
 *
 *  【对象创建四步】
 *    1. 分配内存，所有字段 = 默认值（0 / null）
 *    2. 执行 super(...)：父类字段初始化 → 父类构造器体
 *    3. 回到本类：本类【字段初始化】   ← private int wheels = 3; 的 = 3 就是这一步
 *    4. 执行本类【构造器体】            ← this.wheels = wheels;  是这一步
 *
 *  【两种"初始化"的区别 —— 这是你现在要分清的重点】
 *    【字段初始化】 写在字段声明处（= 3），第 3 步执行，每 new 一次就执行一次，自动的
 *    【构造器体赋值】 写在构造器大括号里（this.wheels = wheels;），第 4 步执行，
 *                    靠你手写，可以覆盖掉第 3 步的值
 *
 *  【三条硬规则】
 *    1. 任何构造器第一句，一定是 super(...)（隐式或显式）
 *    2. this(...) 和 super(...) 只能二选一，都必须是第一句
 *    3. 括号里只能放：参数、字面量、计算、static 方法
 */
public class Vehicle {

    private String brand;

    // ★★【字段初始化】第 3 步执行，值 = 3
    private int wheels = 3;

    public Vehicle(String brand, int wheels) {

        // ★★ 此刻是第 4 步开头，第 3 步【字段初始化】已经跑完，所以打出 3
        System.out.println("  [第3步·字段初始化] wheels = " + this.wheels + "  （= 3 生效了）");

        // ★★【构造器体赋值】第 4 步执行，把 3 覆盖成参数值
        this.brand = brand;
        this.wheels = wheels;

        System.out.println("  [第4步·构造器体赋值] wheels = " + this.wheels + "  （被参数覆盖）");
    }

    public int getWheels() {
        return wheels;
    }

    public String getBrand() {
        return brand;
    }
}