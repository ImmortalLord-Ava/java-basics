package dsh.learning.java.exercise5;

public class Circle extends Shape{
    private double r;
    Circle(String name, double r){
        super(name);
        this.r = r;
    }

    @Override
    public double area() {
        return 3.14 * r * r;
    }

    @Override
    public void draw() {
        System.out.println("绘制图形");
    }
    
}
