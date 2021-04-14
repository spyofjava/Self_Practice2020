package CustomClass.Shape;

public class ShapeObject {

    public static void main(String[] args) {

     Circle circle = new Circle();
     Hexagon hexagon = new Hexagon();
     Equilateral_triangle equilateral_triangle = new Equilateral_triangle();

     circle.setInfo(5);
     hexagon.SetInfo(5);
     equilateral_triangle.setInfo(6);
     equilateral_triangle.setInfo(6,5);

     equilateral_triangle.toString();



    }
}
