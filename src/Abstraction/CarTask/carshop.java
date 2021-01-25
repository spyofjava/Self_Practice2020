package Abstraction.CarTask;

public class carshop {

    public static void main(String[] args) {

        BMW bmw=new BMW("X5","Red",2019, 45000);
        System.out.println(bmw);

        bmw.start();

        Toyota toyota=new Toyota("camry","white",2020, 25000);
        System.out.println(toyota);
        toyota.start();


    }





}
