package dsh.learning.java.exercise5;

public class Shape {
    private String name;
    private String type = "Shape";

    public Shape(String name) {
        this.name = name;
        System.out.println("Shape 构造器：" + name);
    }

    public String getName() { return name; }
    public String getType() { return type; }

    public double area() {
        return 0;
    }

    public void draw() {
        System.out.println("绘制图形");
    }

    public static String category() {
        return "图形";
    }
}
