package Inheritance.ShapeTask;

public class Shape {

    public String name;
    public final static boolean isShape,hasArea ,hasPerimeter;

    public Shape(String name) {
        this.name = name;
    }

    static {
        isShape=true;
        hasArea=true;
        hasPerimeter=true;
    }

    public  double calcarea(){
        return 0;
    }

    public  double calcperimeter(){
        return 0;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "Perimeter= "+calcperimeter()+
                "Area= "+calcarea()+
                '}';
    }
}
