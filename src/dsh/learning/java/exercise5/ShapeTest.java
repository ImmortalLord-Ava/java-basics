package dsh.learning.java.exercise5;

public class ShapeTest {
    public static void main(String[] args) {

        // ===== 第 3 关：建数组 =====
        Shape[] arr = new Shape[2];
        arr[0] = new Circle("c1", 2);
        arr[1] = new Rect("r1", 3, 4);

        // ===== 第 3 关：循环调用 draw() 和 area() =====
        for (int j = 0; j < arr.length; j++) {
            // ❌ 原来：arr[j].area();                -> 返回值没打印，算完就扔
            // ✅ 改成：先接收，再打印
            double area = arr[j].area();
            System.out.println(arr[j].getName() + " 面积 = " + area);
            arr[j].draw();
        }

        // ===== 第 4 关：字段隐藏 vs 方法重写 =====
        // ❌ 原来：一行超长拼接，括号多一个 -> ';' expected
        // ✅ 改成：拆成两句
        String fromShapeType   = arr[0].getType();                 // 声明类型是 Shape
        String fromCircleType  = ((Circle) arr[0]).getType();      // 强转之后才是 Circle
        System.out.println("arr[0].getType()          = " + fromShapeType);
        System.out.println("((Circle) arr[0]).getType() = " + fromCircleType);

        // ===== 第 5 关：static 不参与多态 =====
        // ❌ 原来：arr[0].category();  -> 用对象调 static，而且没打印
        // ✅ 改成：三种写法都打印出来对比
        System.out.println("arr[0].category()  = " + arr[0].category());
        System.out.println("Circle.category()  = " + Circle.category());
        System.out.println("Shape.category()   = " + Shape.category());

        // ===== 第 6 关：Object -> instanceof -> 转型 =====
        // ❌ 原来：Circle b = (Shape) b;   -> ① b 重复定义 ② (Shape) 转出来不能赋给 Circle
        // ✅ 改成：用新变量名 obj，转成 Shape（不是 Circle）
        Object obj = new Circle("c2", 5);
        if (obj instanceof Shape) {
            Shape s = (Shape) obj;
            s.draw();
        }

        // ===== 第 4 关判断题 答案 =====
        //
        // 1. arr[0].getType() 打印什么？
        //    答："Circle"。
        //    因为 getType() 是方法，方法会被重写覆盖，运行时走 Circle 里的版本，返回子类自己的 type。
        //    注意：这是"方法"，不是"字段"。如果直接写 arr[0].type（字段），才轮到字段隐藏起作用。
        //
        // 2. arr[0].category() 打印什么？
        //    答："图形"。
        //    因为 category() 是 static 方法，static 不参与多态，按"声明类型"Shape 来找，
        //    所以调的是 Shape.category()，跟对象实际是什么类型无关。
        //
        // 3. 如果 Shape 里没有 getType()，只有子类有，arr[0].getType() 能编译吗？
        //    答：不能编译。arr[0] 的声明类型是 Shape，Shape 里没有这个方法，
        //    编译器只看声明类型，所以必须先 ((Circle) arr[0]).getType()。
        //
        // 4. Circle c = (Circle) new Shape("s"); 编译过吗？运行呢？
        //    答：编译过（向下转型语法合法），运行时抛 ClassCastException。
        //    因为真实对象是 Shape，不是 Circle，转不过去。
    }
}
