package Ibrahim;

import java.util.Scanner;

public class AppleProduct {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Apple product name");
        String product = scan.nextLine(); //mAc   BoOK
        product = product.substring(0,product.length()).toLowerCase(); // macbook

        switch (product){

            case "macbook":
                System.out.println("Which model of MacBook would like? ");
                String model = scan.nextLine();
                if(model.equalsIgnoreCase("air")){
                    System.out.println("MacBook Air is $2400");
                }else if(model.equalsIgnoreCase("pro")){
                    System.out.println("MacBook Pro is $2500");
                }else{
                    System.err.println("Invalid Model for MacBook");
                }
                break;

            case "iphone":
                System.out.println("Which model of Iphone would you like");
                String model2 = scan.nextLine().toLowerCase();
                if(model2.equals("12")){
                    System.out.println("Iphone 12 is $1000");
                }else if(model2.equals("11")){
                    System.out.println("Iphone 11 is $900");
                }else if( model2.equals("10")){
                    System.out.println("Iphone 10 is $800");
                }else if(model2.equals("8")){
                    System.out.println("Iphone 8 is $700");
                }else{
                    System.err.println("Invalid Model for Iphone");
                }

                break;

            case "ipad":
                System.out.println("Which Model of Ipad");
                String model3 = scan.nextLine().toLowerCase();
                switch (model3){
                    case "air":
                        System.out.println("iPad air is $500");
                        break;

                    case "pro":
                        System.out.println("iPad pro is $400");
                        break;

                    case "mini":
                        System.out.println("iPad Mini is $300");
                        break;

                    default:
                        System.err.println("Invalid model for iPad");
                }

                break;

            default:
                System.err.println("Invalid Product Name");
        }





    }
}
/*Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.

- int variable itemPrice
- int variables quarters, dimes, nickels
- Scanner object

The program accepts itemPrice, which is a price for the item you would like to purchase.

Positive behavior:

Please follow the example in the image. dots mean empty space.
-Since the item price was entered 95, change is 1 nickel

Negative behavior:

If itemPrice is less than 25 or more than 100 cents, then display an error message:
Invalid price!

If itemPrice is not divisible by 5, then also display an error message:
Invalid price!

use (itemPrice % 5 == 0) expression to find it is divisible by 5.

Do not display anything else.




 */


