package Inheritance.ShapeTask;

public class Shape {

    public String name;  //instance variable
    public final static boolean isShape, hasArea, hasPerimeter; // constant -----3 static variables

    public Shape(String name) {
        this.name = name;
    }

    static {
        isShape=true;
        hasArea=true;
        hasPerimeter=true;
    }

    public double calcArea(){
        return 0;
    }


    public double calcPerimeter(){
        return 0;
    }


}
