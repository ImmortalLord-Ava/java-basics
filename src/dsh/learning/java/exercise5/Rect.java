package dsh.learning.java.exercise5;

public class Rect extends Shape{
    private double width;
    private double height;
    private String type = "Rect";
    public Rect(String name, double w, double h){
        super(name);
       this.width = w;
       this.height = h;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }

    @Override
    public String getType() {
        return type;
    }
    public static String category() {
        return "矩形";
    }
}
