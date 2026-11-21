package practice.geometry;

/** 圆。 */
public class Circle extends GeometricObject {

    private double radius;

    public Circle(double radius) {
        this("白色", 0.0, radius);
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** 面积 = πr²。用 Math.PI，不要用 3.14。 */
    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
