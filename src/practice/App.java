package practice;

import practice.geometry.Circle;
import practice.geometry.GeometricObject;
import practice.geometry.GeometryCompare;
import practice.geometry.MyRectangle;

/**
 * 程序入口。
 *
 * <p>核心演示：数组的类型是父类 GeometricObject，
 * 里面装的却是 Circle 和 MyRectangle 两种子类对象，
 * 调用 findArea() 时各走各的实现——这就是多态。
 */
public class App {

    public static void main(String[] args) {
        GeometricObject[] shapes = {
                new Circle(2.0),
                new MyRectangle(3.0, 4.0),
                new Circle("红色", 1.5, 2.5)
        };

        System.out.println("== 全部图形 ==");
        for (GeometricObject shape : shapes) {
            System.out.println(shape);
        }

        GeometricObject first = shapes[0];
        GeometricObject second = shapes[1];

        System.out.println();
        System.out.println("前两个面积相等？ " + GeometryCompare.equalsArea(first, second));
        System.out.println("面积较大的是：");
        System.out.println("  " + GeometryCompare.larger(first, second));
    }
}
