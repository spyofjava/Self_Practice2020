package CustomClass.Shape;

public class Equilateral_triangle {
    public double side;
    public double perimeter;
    public double area;
    public double height;

    public void setInfoWithoutHeight(double side){
        perimeter=side*3;
        area = (side*side*Math.sqrt(3))/4;
    }

}
