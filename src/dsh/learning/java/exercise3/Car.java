package dsh.learning.java.exercise3;

public class Car extends Vehicle {

    // ★★【字段初始化】第 3 步执行（在 super(...) 之后）
    private String color = "透明";

    public Car(String brand, int wheels, String color) {

        // 第 2 步：进父类（必须第一句）
        super(brand, wheels);

        // ★★ 第 4 步开头，第 3 步【字段初始化】刚跑完，所以打出 透明
        System.out.println("  [第3步·字段初始化] color = " + this.color + "  （= 透明 生效了）");

        // ★★【构造器体赋值】第 4 步执行，把 透明 覆盖成参数值
        this.color = color;

        System.out.println("  [第4步·构造器体赋值] color = " + this.color + "  （被参数覆盖）");
    }

    public Car(String brand) {
        this(brand, 4, "黑色");
        System.out.println("  [第5步] 单参构造器体：串联完成");
    }

    public void show() {
        System.out.println("  品牌=" + getBrand() + "  轮子=" + getWheels() + "  颜色=" + color);
    }
}