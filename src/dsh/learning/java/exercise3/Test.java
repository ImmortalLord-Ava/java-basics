package dsh.learning.java.exercise3;

/*
 * 运行这个类看执行顺序。
 * 重点关注：Vehicle 的构造器打印出来的 wheels 是 3（初始值），
 *           Car 的三参构造器第一次打印出来的 color 是 透明（初始值）。
 * 这两次打印证明了：字段初始化排在 super(...) 之后、构造器体之前。
 */
public class Test {
    public static void main(String[] args) {

        System.out.println("========== new Car(\"比亚迪\") ==========");
        System.out.println("  [V1] 分配内存");
        System.out.println("  [V2] 进入 Car(String)，第一句是 this(brand, 4, \"黑色\")");
        System.out.println("        → 跳到 Car(String,int,String)");
        Car c1 = new Car("比亚迪");
        System.out.println("  [C6] 对象构造完成");
        c1.show();

        System.out.println();
        System.out.println("========== new Car(\"宝马\", 4, \"白色\") ==========");
        System.out.println("  [V1] 分配内存");
        System.out.println("  [V2] 进入 Car(String,int,String)，第一句是 super(brand, wheels)");
        Car c2 = new Car("宝马", 4, "白色");
        System.out.println("  [C6] 对象构造完成");
        c2.show();
    }
}