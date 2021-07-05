package July_Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {


    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please input an integer number: ");
        Armstrong(scan.nextInt());
    }

    public static void Armstrong(int num){
        int num2 = num;
        int num3 = num;
        int count = 1;
        while (num > 9) { //sayi kac basamakli?
            num = num / 10; // 15
            count++;
        } // sayi kac basamkli?

        //153
        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 0; i < count; i++) { //basamaklar indirgeniyor.
            list.add(num2 %10);
            num2 /= 10;
        }

       if (totalOfCubes(list) == num3){
           System.out.println("Yes "+ num3 + " is an Armstrong number");
       }else {
           System.out.print("No "+ num3 + " is not an ");
           System.err.println("Armstrong number");
       }

    }

    public static int result = 0 ;
    public static int totalOfCubes(ArrayList<Integer> number){
        for (int each: number) {
            result += (each)*(each)*(each);
        }
        return result;
    }



}
