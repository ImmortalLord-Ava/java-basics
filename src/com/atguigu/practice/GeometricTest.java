package com.atguigu.practice;

public class GeometricTest {
    public static void main(String[] args){
            GeometricTest test1=new GeometricTest();
            Circle c1=new Circle(4.0);
            MyRectangle c2=new MyRectangle(4.0,3.0);
            test1.equalsAr
            test1.displayGeometricObject(c1);
            test1.displayGeometricObject(c2);
    }
    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea()==o2.findArea;
    }
    public void displayGeometricObject(GeometricObject o){
        System.out.println("面积为；" + o.findArea());
    }
}
;