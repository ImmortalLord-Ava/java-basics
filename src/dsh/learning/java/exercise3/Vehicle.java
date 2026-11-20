package dsh.learning.java.exercise3;

/*
 * ============================================================
 *  构造器执行顺序 · 总结（从这里开始看）
 * ============================================================
 *
 *  【对象创建四步】
 *    1. 分配内存，所有字段 = 默认值（0 / null）
 *    2. 执行 super(...)：父类字段初始化 → 父类构造器体
 *    3. 回到本类：本类字段初始化（= 3、= "透明" 这种）
 *    4. 执行本类构造器体
 *
 *  【三条硬规则】
 *    1. 任何构造器第一句，一定是 super(...)（隐式或显式）
 *    2. this(...) 和 super(...) 只能二选一，且都必须是第一句
 *    3. 括号里只能放：参数、字面量、计算、static 方法
 *       —— 不能放实例字段、实例方法（那时对象还是半成品）
 *
 *  【所以字段初始化排在】
 *    父类构造器之后、自己构造器体之前 —— 也就是第 3 步。
 */
public class Vehicle {

    private String brand;

    // 属于第 3 步，不是第 1 步
    private int wheels = 3;

    public Vehicle(String brand, int wheels) {

        // 打印 this.wheels（字段），出来是 3，证明第 3 步已完成
        System.out.println("  [V3] 父类构造器体开始：字段 wheels = " + this.wheels);

        this.brand = brand;
        this.wheels = wheels;

        System.out.println("  [V4] 父类构造器体结束：brand=" + this.brand + "  wheels=" + this.wheels);
    }

    public int getWheels() {
        return wheels;
    }

    public String getBrand() {
        return brand;
    }
}