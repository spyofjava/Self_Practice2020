package Ibrahim;

import java.util.Scanner;

public class ShoppinglistAdvance {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double totalprice=0;
        String shoppinglistReport="";
        System.out.println("Enter Item1 and its price:");
        String item1 = input.nextLine();
        double price1 = input.nextDouble();
        totalprice+=price1;
        System.out.println("Add one more item?");

        String YesOrNo = input.next().toLowerCase();
        if (YesOrNo.equals("yes")) {

            while (YesOrNo.equals("yes")) {

                for (int i = 2; i <= 10;i++ ) {

                    System.out.println("Enter Item" + i + " and its price:");
                    String item = input.next();
                    double price = input.nextDouble();

                    totalprice += price;
                    shoppinglistReport+=", "+"Item"+i+": "+item+ " Price: "+price;
                    System.out.println("Add one more item?");
                    YesOrNo = input.next().toLowerCase();

                    if (YesOrNo.equals("no")) {

                        System.out.println("Item1: "+item1+ " Price: "+price1+shoppinglistReport);
                        System.out.println("Total price: "+totalprice);
                        break;
                    }

                }
            }
        }else {
            System.out.println("Item1: "+item1+" Price: "+price1);
            System.out.println("Total price: "+totalprice);
        }




    }
}
/*
output: Enter Item1 and its price:
input: Tomatoes
input: 5.5
output: Add one more item?
input: yes
output: Enter Item2 and its price:
input: Cheese
input: 3.5
output: Add one more item?
input: yes
output: Enter Item3 and its price:
input: Apples
input: 6.3
output: Add one more item?
input: no
output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
output: Total price: 15.3

 */