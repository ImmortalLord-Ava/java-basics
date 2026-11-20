package dsh.learning.java.exercise3;

/*
 * 【执行顺序 详细标记】
 * 第1步 分配内存：Car.color=null
 * 第2步 super(brand, wheels) —— 跳到父类 Vehicle
 *        在父类里依次走：父类字段初始化(wheels=3) -> 父类构造器体
 * 第3步 回到 Car，执行本类字段初始化：color = "透明"
 * 第4步 执行本类构造器体剩下的代码
 */
public class Car extends Vehicle {

    // ★顺序点：这个 = "透明" 属于【第3步】，在 super(...) 之后才生效
    private String color = "透明";

    public Car(String brand, int wheels, String color) {

        // ★★★ 你原来把 println 写在这一行上面，编译直接报错：
        //      call to super must be first statement in constructor
        //      因为第2步还没做，第3步也没做，color 此刻根本还不存在
        super(brand, wheels);

        // ★顺序点：到这里，第3步刚做完，字段 color 已经是 "透明"
        //   注意这里必须写 this.color，直接写 color 拿到的是参数
        System.out.println("  [C3] Car 三参构造器体开始：字段 color = " + this.color + "（初始值已生效）");

        this.color = color;

        System.out.println("  [C4] Car 三参构造器体结束：color=" + this.color);
    }

    public Car(String brand) {
        // ★this(...) 也只能是第一句：先转到本类三参构造器，super 在那边执行
        this(brand, 4, "黑色");
        System.out.println("  [C5] Car(String) 构造器体：串联执行完");
    }

    public void show() {
        // ★这里已经不在构造器里了，对象早就成形，字段随便用
        System.out.println("  品牌=" + getBrand() + "  轮子=" + getWheels() + "  颜色=" + color);
    }
}