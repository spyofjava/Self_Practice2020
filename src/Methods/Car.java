package Methods;

public class Car {

    public String brand,model,color;
    public int year;

    public void setInfo(String brand,String model,String color,int year){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.year=year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
