package Ibrahim;

import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {
        int propertyprice=0;

        Scanner input=new Scanner(System.in);
        System.out.println("*****************************************\n" +
                "* Welcome to the RealEstate calculator! *\n" +
                "*****************************************");

        System.out.println("Enter your property type:");
        String HomeType= input.next();
        if (HomeType.equals("condo")){
            propertyprice+=50000;

            System.out.println("How many bedrooms do you have?");
            int bedroom= input.nextInt();
            propertyprice+=30000*bedroom;

            System.out.println("Do you have a backyard?true/false");
            boolean backyard= input.nextBoolean();
            if (backyard) {
                System.out.println("Backyard is not available for condo!");
            }

            System.out.println("Do you have garage?true/false");
            boolean garage= input.nextBoolean();
            if (garage) {
                System.out.println("How many spots?");
                int spot= input.nextInt();
                if (spot>10){
                    System.out.println("Pardon,  it's not a public parking!");
                }else {
                    propertyprice += 20000 * spot;
                }
            }

            System.out.println("How close is metro station?");
            float metro= input.nextFloat();
            if (metro < 1) {
                propertyprice+=10000;
            }else if (1<metro&&metro<3){
                propertyprice+=5000;
            }


            System.out.println("How close is highway?");
            float highway= input.nextFloat();


            if (highway < 1) {
                propertyprice+=15000;
            }else if (1<highway&&highway<5){
                propertyprice+=8000;
            }else if (5<highway&&highway<20){
                propertyprice+=4000;
            }


            System.out.println("What's the rating of nearest school?");
            float schoolrate= input.nextFloat();

            if (schoolrate <=10&&schoolrate>8) {
                propertyprice+=45000;
            }else if (4<=schoolrate&&schoolrate<8){
                propertyprice+=20000;
            }else {
                propertyprice+=5000;
            }



            System.out.println("Does any of your family members smoking?true/false");
            boolean smoke= input.nextBoolean();

            if (smoke){
                propertyprice-=5000;
            }


            System.out.println("Market report has been generated.");
            System.out.println("Your estimate market price is: "+propertyprice+"$");


        }else if (HomeType.equals("townhouse")){
            propertyprice+=75000;

            System.out.println("How many bedrooms do you have?");
            int bedroom= input.nextInt();
            propertyprice+=30000*bedroom;

            System.out.println("Do you have a backyard?true/false");
            boolean backyard= input.nextBoolean();
            if (backyard){
                propertyprice+=5000;
            }

            System.out.println("Do you have garage?true/false");
            boolean garage= input.nextBoolean();
            if (garage) {
                System.out.println("How many spots?");
                int spot= input.nextInt();
                if (spot>10){
                    System.out.println("Pardon,  it's not a public parking!");
                }else {
                    propertyprice += 20000 * spot;
                }
            }


            System.out.println("How close is metro station?");
            float metro= input.nextFloat();
            if (metro < 1) {
                propertyprice+=10000;
            }else if (1<metro&&metro<3){
                propertyprice+=5000;
            }


            System.out.println("How close is highway?");
            float highway= input.nextFloat();

            if (highway < 1) {
                propertyprice+=15000;
            }else if (1<highway&&highway<5){
                propertyprice+=8000;
            }else if (5<highway&&highway<20){
                propertyprice+=4000;
            }


            System.out.println("What's the rating of nearest school?");
            float schoolrate= input.nextFloat();

            if (schoolrate <=10&&schoolrate>8) {
                propertyprice+=45000;
            }else if (4<=schoolrate&&schoolrate<8){
                propertyprice+=20000;
            }else {
                propertyprice+=5000;
            }


            System.out.println("Does any of your family members smoking?true/false");
            boolean smoke= input.nextBoolean();
            if (smoke){
                propertyprice-=5000;
            }

            System.out.println("Market report has been generated.");
            System.out.println("Your estimate market price is: "+propertyprice+"$");


        }else if (HomeType.equals("single family house")){
            propertyprice+=95000;

            System.out.println("How many bedrooms do you have?");
            int bedroom= input.nextInt();
            propertyprice+=30000*bedroom;


            System.out.println("Do you have a backyard?true/false");
            boolean backyard= input.nextBoolean();
            if (backyard){
                propertyprice+=5000;
            }

            System.out.println("Do you have garage?true/false");
            boolean garage= input.nextBoolean();
            if (garage) {
                System.out.println("How many spots?");
                int spot= input.nextInt();
                if (spot>10){
                    System.out.println("Pardon,  it's not a public parking!");
                }else {
                    propertyprice += 20000 * spot;
                }
            }

            System.out.println("How close is metro station?");
            float metro= input.nextFloat();
            if (metro < 1) {
                propertyprice+=10000;
            }else if (1<metro&&metro<3){
                propertyprice+=5000;
            }


            System.out.println("How close is highway?");
            float highway= input.nextFloat();

            if (highway < 1) {
                propertyprice+=15000;
            }else if (1<highway&&highway<5){
                propertyprice+=8000;
            }else if (5<highway&&highway<20){
                propertyprice+=4000;
            }

            System.out.println("What's the rating of nearest school?");
            float schoolrate= input.nextFloat();


            if (schoolrate <=10&&schoolrate>8) {
                propertyprice+=45000;
            }else if (4<=schoolrate&&schoolrate<8){
                propertyprice+=20000;
            }else {
                propertyprice+=5000;
            }


            System.out.println("Does any of your family members smoking?true/false");
            boolean smoke= input.nextBoolean();

            if (smoke){
                propertyprice-=5000;
            }

            System.out.println("Market report has been generated.");
            System.out.println("Your estimate market price is: "+propertyprice+"$");

        }


    }
}
