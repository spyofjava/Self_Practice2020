package Inheritance.ShapeTask;

public  class Rectangle extends Shape {
    public double width,length;

    public Rectangle( double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }


    public double calcarea(){
        return width*length;
    }


    @Override
    public double calcperimeter(){
        return 2*(width+length);
    }


}
