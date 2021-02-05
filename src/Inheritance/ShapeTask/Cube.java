package Inheritance.ShapeTask;

public final class Cube extends Shape{

    public double side;

    public Cube( double side) {
        super("Cube");
        this.side = side;
    }

    @Override
    public double calcarea() {
        return 6*side*side;
    }

    public double volume(){
        return side*side*side;
    }

}
