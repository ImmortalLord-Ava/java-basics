package dsh.learning.java.exercise5;

public class ShapeTest {
    public static void main(String[] args){
        Shape[] arr = new Shape[2];
            arr[0] = new Circle("c1",2);
            arr[1] = new Rect("r1",3,4);
                System.out.println("arr[0].getType()=" + arr[0].getType() + ",(Circle) arr[0]).getType()=" + (Circle) arr[0]).getType());
                  arr[0].category();
            for (int j = 0; j < 2 ; j++) {
                arr[j].area();
                arr[j].draw();
            }
            System.out.println(Circle.category());
            Object b = new Circle("",r);
            if (b instanceof Shape){
                Circle b = (Shape) b;
                b.draw();
            }

        }
    }
}
