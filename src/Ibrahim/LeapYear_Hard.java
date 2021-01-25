package Ibrahim;

import java.util.Scanner;

public class LeapYear_Hard {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int yEar = input.nextInt();
/*
        boolean leapYear = yEar%4==0 && yEar%100!=0 && yEar%400==0 && yEar%4000!=0;
        if (leapYear){
                System.out.println("Leap");
        }else {
            System.out.println("Regular");
        }
        */

        if (yEar%4==0){
            if (yEar%100!=0){
                if (yEar%400==0){
                    System.out.println("Leap");
                }
            }
        }else{
            System.out.println("Regular");
        }
        if (yEar==2000){
            System.out.println("Leap");
        }
        if (yEar%4000!=0){
            System.out.println("leap");
        }else{
            System.out.println("Regular");
        }


/*
4’e tam bölünen yıllar artık yıldır.
100’e tam bölünen yıllar artık yıl değildir.
400’e tam bölünen yıllar artık yıldır.
4000’e tam bölünen yıllar artık yıl değildir.
 */

    }
}
