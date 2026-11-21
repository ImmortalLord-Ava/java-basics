package practice.geometry;

/**
 * 图形比较工具类。
 *
 * <p>工具类不需要被 new 出来，所以构造器私有；
 * 方法全部 static，直接 类名.方法名 调用。
 */
public final class GeometryCompare {

    /** 浮点数比较允许的误差。double 不能用 == 直接比。 */
    public static final double EPSILON = 1e-6;

    private GeometryCompare() {
    }

    /** 两个图形面积是否相等。 */
    public static boolean equalsArea(GeometricObject a, GeometricObject b) {
        return Math.abs(a.findArea() - b.findArea()) < EPSILON;
    }

    /** 返回面积较大的那个图形。 */
    public static GeometricObject larger(GeometricObject a, GeometricObject b) {
        return a.findArea() >= b.findArea() ? a : b;
    }
}
