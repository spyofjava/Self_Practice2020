package CustomClass.Shape;

public class Circle {

    public double radius;
    public static double PI=3.14;
    public double perimeter=2*PI*radius;
    public double area = PI*radius*radius;


    public void setInfo(double radius){
        this.radius=radius;
        perimeter=2*PI*radius;
        area=PI*radius*radius;

    }

    public void getInfo(){

        System.out.println("perimeter: "+perimeter);
        System.out.println("area: "+area);
    }


    @Override
    public String toString() {

        return "Circle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}



