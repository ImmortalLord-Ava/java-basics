package dsh.learning.java.exercise5;

public class ShapeTest {
    public static void main(String[] args){
        Shape[] arr = new Shape[2];
        for (int i = 0; i < 2; i++) {
            if(arr[i] instanceof Circle){
            arr[i] = new Circle("c1",2);
            }else{
                arr[i] = new Rect("r1",3,4);
            }
            for (int j = 0; j < 2 ; j++) {
                arr[i].area();
                arr[i].draw();
            }
            System.out.println("arr[0].getType()=" + arr[0].getType() + "" );
        }
    }
}
