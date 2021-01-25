package Abstraction.ShapeTask;

public final class Cylinder extends Shape implements volume {

    public double radius;
    public double height;
    public final static double PI=3.14;

    public Cylinder(String name, double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return 2*PI*radius*(radius+height);
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return PI*radius*radius*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "volume='" + perimeter() + '\'' +

                '}';
    }
}
