package Ibrahim;

import java.util.Scanner;

public class EstimateHousePrice {
    public static void main(String[] args) {

        int propertyPrice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");


        System.out.println("Enter your property type:");
        String propertyType=scan.next();
        if (propertyType.equalsIgnoreCase("Condo")){
            propertyPrice+=50000;
        }else if (propertyType.equalsIgnoreCase("Townhouse")){
            propertyPrice+=75000;
        }else if (propertyType.equalsIgnoreCase("Single Family Home")){
            propertyPrice+=95000;
        }

        scan.nextLine();
        System.out.println("How many bedrooms do you have?");
        int bed=scan.nextInt();
        propertyPrice+=30000*bed;

        if (propertyType.equalsIgnoreCase("condo")){
            System.out.println("Backyard is not available for condo!");
        }else {
            System.out.println("Do you have a backyard?");
            String back_yard = scan.next();//true and false
            boolean backyard1=back_yard.equalsIgnoreCase("true");
            System.out.println(backyard1);
            if (backyard1) {
                propertyPrice += 5000;
            }
        }




        System.out.println("Do you have garage?");
        String YorN=scan.next(); // true false
        boolean garaj=YorN.equalsIgnoreCase("true");

        if (garaj) {

            System.out.println("How many spots?");
            int spot = scan.nextInt();

            if (spot>10){
                System.out.println("Pardon,  it's not a public parking!");
            }else {
                propertyPrice += 20000*spot;
            }

        }


        System.out.println("How close is metro station?");
        float station=scan.nextFloat();
        if (station<=1){
            propertyPrice+=10000;
        }else if (station>1 && station<3){
            propertyPrice+=5000;
        }

        System.out.println("How close is highway?");
        float highway=scan.nextFloat();
        if (highway<=1){
            propertyPrice+=15000;
        }else if (highway>1 && highway<5){
            propertyPrice+=8000;
        }else if (highway>5 && highway<=20){
            propertyPrice+=4000;
        }

        System.out.println("What's the rating of nearest school?");
        float SchoolScore=scan.nextFloat();
        if (SchoolScore>8 && SchoolScore<=10){
            propertyPrice+=45000;
        }else if (SchoolScore>=4 && SchoolScore<8){
            propertyPrice+=20000;
        }else {
            propertyPrice+=5000;
        }

        System.out.println("Does any of your family members smoking?");
        String  smokingMembers=scan.next();//true and false

        boolean smoke=smokingMembers.equalsIgnoreCase("true");

        if (smoke){
            propertyPrice-=5000;
        }

        System.out.println("Your estimate market price is: "+propertyPrice+"$");



    }
}
