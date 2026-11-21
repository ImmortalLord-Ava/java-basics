package practice.geometry;

/**
 * 所有几何图形的父类。
 *
 * <p>这里只放"任何图形都有"的东西：颜色、重量。
 * 面积怎么算由子类自己决定，所以 findArea() 是抽象的。
 */
public abstract class GeometricObject {

    private String color;
    private double weight;

    protected GeometricObject() {
        this("未设置", 0.0);
    }

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    /** 子类必须实现：返回图形的面积。 */
    public abstract double findArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * 打印对象时自动调用。
     * getClass().getSimpleName() 会拿到子类真实的类名（多态）。
     */
    @Override
    public String toString() {
        return String.format("%-12s 颜色=%-6s 重量=%.1f 面积=%.3f",
                getClass().getSimpleName(), color, weight, findArea());
    }
}
