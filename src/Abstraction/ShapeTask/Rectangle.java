package Abstraction.ShapeTask;

public class Rectangle extends Shape {

    public double weight;
    public  double length;

    public Rectangle(double weight, double length) {
        super("Rectangle");
        this.weight = weight;
        this.length = length;
    }

    @Override
    public double area() {
        return weight*length;
    }

    @Override
    public double perimeter() {
        return 2*(weight+length);
    }





}
