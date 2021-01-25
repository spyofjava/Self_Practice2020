package Statics;

import java.text.DecimalFormat;

public class Circle {

    public double radius,area,perimeter;

    public double PI=Math.PI;

    public Circle(double radius) {
        this.radius = radius;
        area=area();
        perimeter=perimeter();

    }

    public double area(){
        area=PI*radius*radius;
        return area;
    }
    public double perimeter(){
        perimeter=2*PI*radius;
        return perimeter;
    }

    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("0.000");
        return "Circle{" +
                "radius=" + df.format(radius) +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                '}';
    }
}
