package CustomClass.CarTask;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

    public String Brand;
    public String Model;
    public String Color;
    public Integer Year;
    public Double Price;

    public void setInfo(String Brand, String Model, String Color, Integer Year, Double Price) {
        this.Brand = Brand;
        this.Model = Model;
        this.Color = Color;
        this.Year = Year;
        this.Price = Price;
    }

    public void getInfo() {
        System.out.println("Brand: " + Brand + "\nModel: " + Model + "\n Color: " + Color + "\n Year: " + Year + "\nPrice: " + Price);
    }


    @Override
    public String toString() {
        return "Car{" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", Color='" + Color + '\'' +
                ", Year=" + Year +
                ", Price=" + Price +
                '}';
    }
}

class CarObject {
    public static void main(String[] args) {


        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();



        car1.Brand = "Toyota";
        car1.Model = "Prius";
        car1.Color = "Yellow;";
        car1.Price = 6.300;
        car1.Year = 2012;

        car1.getInfo();
        System.out.println("============================\n");


        car2.setInfo("Mercedes","C220","Purple",2020,12.999);
        car2.getInfo();


        System.out.println(car1.toString());

        System.out.println("===================\n");

        List<Car> list = new ArrayList<Car>();
        list.addAll(Arrays.asList(car1,car2,car3));

        System.out.println(list);

        System.out.println(list.get(2));

    }
}
