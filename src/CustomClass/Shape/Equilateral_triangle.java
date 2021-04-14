package CustomClass.Shape;

public class Equilateral_triangle {
    public double side;
    public double perimeter;
    public double area;
    public double height;

    public void setInfo(double side){
        perimeter=side*3;
        area = (side*side*Math.sqrt(3))/4;
    }

    public void setInfo(double side,double height){
        perimeter=side*3;
        area = (side*height)/2;
    }

    public void getInfo(){
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }

    @Override
    public String toString() {
        return "Equilateral_triangle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
