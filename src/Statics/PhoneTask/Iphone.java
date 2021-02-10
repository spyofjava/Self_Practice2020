package Statics.PhoneTask;

import java.text.DecimalFormat;

public  class Iphone {

    public String model,color,storage;
    public double price;

    public static String brand="Apple",OS="iOS",madeIn="China";

    public void call(long phoneNumber){

        System.out.println("Iphone"+model+" is calling"+" from "+(phoneNumber));
    }
    public static void model(){
        System.out.println("11 Pro Max");
    }
    public static void getInfo(){
        System.out.println("Brand: "+ brand);
        System.out.println("Operating System: "+OS);
        System.out.println("Made in: "+madeIn);
    }

    public String toString() {
        return  "Brand= "+brand+
                "model= " + model +
                " color= " + color +
                " price= " + price +
                "Operating System= "+OS;
    }


}
