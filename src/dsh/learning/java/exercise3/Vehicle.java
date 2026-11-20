package dsh.learning.java.exercise3;

/*
 * 【执行顺序 详细标记】
 * 第1步 分配内存：brand=null, wheels=0
 * 第2步 super() —— Object 的构造器，什么都不做
 * 第3步 字段初始化：wheels = 3      <-- 这一步你平时看不见，但它一定发生
 * 第4步 构造器体（下面大括号里的代码）
 */
public class Vehicle {

    private String brand;

    // ★顺序点：这个 = 3 属于【第3步】，比构造器体早，比 super(...) 晚
    private int wheels = 3;

    public Vehicle(String brand, int wheels) {

        // ★这里打印的是 this.wheels（字段），不是参数 wheels
        //   能打出来 3，就证明第3步已经完成了
        System.out.println("  [V3] Vehicle 构造器体开始：字段 wheels = " + this.wheels + "（初始值已生效）");

        this.brand = brand;
        this.wheels = wheels;

        System.out.println("  [V4] Vehicle 构造器体结束：brand=" + this.brand + "  wheels=" + this.wheels);
    }

    public int getWheels() {
        return wheels;
    }

    public String getBrand() {
        return brand;
    }
}