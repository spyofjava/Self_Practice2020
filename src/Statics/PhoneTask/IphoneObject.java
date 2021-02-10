package Statics.PhoneTask;

public class IphoneObject {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        System.out.println("iphone.price = " + iphone.price);
        System.out.println("iphone.model = " + iphone.model);
        iphone.model="pro12";
        System.out.println("iphone.model = " + iphone.model);

        System.out.println("Iphone.brand = " + Iphone.brand);

        System.out.println(iphone.model);
        Iphone.model();

        Iphone.getInfo();

        iphone.call(1_321_654_651);

        //iphone.OS;

        System.out.println("Iphone.OS = " + Iphone.OS);

        System.out.println("--------------------");

        System.out.println(iphone);

    }
}
