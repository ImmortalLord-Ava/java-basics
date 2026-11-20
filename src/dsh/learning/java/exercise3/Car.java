package dsh.learning.java.exercise3;

public class Car extends Vehicle {

    // 属于第 3 步：在 super(...) 之后才生效
    private String color = "透明";

    public Car(String brand, int wheels, String color) {

        // ★必须是第一句：写在这行前面的任何代码都会报错
        //   call to super must be first statement in constructor
        super(brand, wheels);

        // ★这里写 this.color 才是字段；直接写 color 拿到的是参数
        System.out.println("  [C3] 子类构造器体开始：字段 color = " + this.color);

        this.color = color;

        System.out.println("  [C4] 子类构造器体结束：color=" + this.color);
    }

    public Car(String brand) {
        // ★this(...) 也只能是第一句：先转到上面那个构造器，super 在那边执行
        this(brand, 4, "黑色");
        System.out.println("  [C5] 单参构造器体：串联完成");
    }

    public void show() {
        // 已经不在构造器里，字段随便用
        System.out.println("  品牌=" + getBrand() + "  轮子=" + getWheels() + "  颜色=" + color);
    }
}