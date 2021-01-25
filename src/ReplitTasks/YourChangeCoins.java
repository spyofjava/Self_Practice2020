package ReplitTasks;

import java.util.Scanner;

public class YourChangeCoins {
    public static void main(String[] args) {

        Scanner input=new Scanner((System.in));

        System.out.println("Enter price in cents:");
        int itemprice= input.nextInt();
        int dollar=100;
        int dimes=10;
        int quarters=25;
        int nickels=5;

        if(itemprice%5!=0) {
            System.out.println("Invalid price!");
        }else {

            if (itemprice >= 25 && itemprice <= 100) {

                int changeamount = dollar - itemprice;//100-15=85
                if (changeamount >= quarters) {

                    int quarteramount1 = changeamount / quarters;//85/75=3 quarter(0=75 cent)
                    System.out.print("Your change is " + quarteramount1 + " quarters");

                    int leftamount = changeamount - (quarteramount1 * quarters);//85-75=10

                    int dimesamount = leftamount / dimes;//10/10=1 dimes
                    System.out.print(", " + dimesamount + " dimes");

                    int leftamount2 = leftamount - dimesamount * dimes;

                    int nickelsamount = leftamount2 / nickels;
                    System.out.println(", and " + nickelsamount + " nickels.");


                } else if (changeamount < 25) {
                    int quarteramount = changeamount / quarters;
                    System.out.print("Your change is " + quarteramount + " quarters, ");
                    int dimesamount = changeamount / dimes;//20/10=2 dimes or 15/10=1 dimes
                    System.out.print(dimesamount + " dimes");
                    int leftamount = changeamount - dimesamount * dimes;//15-10=5cents
                    int nicklesamount = leftamount / nickels;//5/5=1
                    System.out.println(", and " + nicklesamount + " nickels.");

                }


            } else {
                System.out.println("Invalid price");
            }
        }



    }
}
