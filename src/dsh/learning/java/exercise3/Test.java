package dsh.learning.java.exercise3;

/*
 * 看四行输出，就能把两种初始化分开：
 *   [第3步·字段初始化] wheels = 3     ← 字段声明处的 = 3
 *   [第4步·构造器体赋值] wheels = 4   ← 构造器里的 this.wheels = wheels;
 *   [第3步·字段初始化] color = 透明   ← 字段声明处的 = "透明"
 *   [第4步·构造器体赋值] color = 黑色 ← 构造器里的 this.color = color;
 */
public class Test {
    public static void main(String[] args) {

        System.out.println("========== new Car(\"比亚迪\") ==========");
        Car c1 = new Car("比亚迪");
        c1.show();

        System.out.println();
        System.out.println("========== new Car(\"宝马\", 4, \"白色\") ==========");
        Car c2 = new Car("宝马", 4, "白色");
        c2.show();
    }
}