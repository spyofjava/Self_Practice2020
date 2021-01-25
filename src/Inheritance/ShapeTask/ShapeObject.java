package Inheritance.ShapeTask;

public class ShapeObject {

    public static void main(String[] args) {


        Cube cube=new Cube(12);

        System.out.println(cube);
        System.out.println(cube.volume());

        System.out.println(cube.isShape);

        Rectangle rectangle=new Rectangle(4, 5);
        System.out.println(rectangle.length);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());



    }
}
