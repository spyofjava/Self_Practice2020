package Methods;

import java.util.ArrayList;
import java.util.*;

public class CarObjects {

    public static void main(String[] args) {

        Car car1= new Car();
        car1.setInfo("Toyota", "Prius", "gold", 2010);

        Car car2= new Car();
        car2.setInfo("BMW", "X7", "Gray", 2020);

        Car car3= new Car();
        car3.setInfo("Renault", "Broadway", "Red", 2021);

        Car car4= new Car();
        car4.setInfo("Mercedes", "A310", "Black",2019);

        /*
        ArrayList<Car> list=new ArrayList<>(Arrays.asList(car1,car2,car3,car4));


        for (Car each:list){
            System.out.println(each);
        }


         */



    }
}
