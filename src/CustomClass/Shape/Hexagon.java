package CustomClass.Shape;

public class Hexagon {
    public double perimeter;
    public double area;
    public double size;

    public void SetInfo(double size) {
        this.size = size;
        perimeter = 6 * size;
        area = (size*size*Math.sqrt(3))/4;
    }

    public void getInfo(){
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
