package dsh.learning.java.exercise3;

/*
 * 看两个证据：
 *   [V3] 打出 wheels = 3     → 父类字段初始化已完成
 *   [C3] 打出 color = 透明   → 子类字段初始化已完成
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