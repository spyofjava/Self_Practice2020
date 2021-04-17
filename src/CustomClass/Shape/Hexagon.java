package CustomClass.Shape;

public class Hexagon {
    public double size;
    public double perimeter = 6 * size;
    public double area = ((size*size*Math.sqrt(3))/4)*6;


    public void SetInfo(double size) {
        this.size = size;
        perimeter = 6 * size;
        area = ((size*size*Math.sqrt(3))/4)*6;
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
