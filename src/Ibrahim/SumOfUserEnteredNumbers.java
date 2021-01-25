package Ibrahim;

import java.util.Scanner;

public class SumOfUserEnteredNumbers {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        int sum=0;
        System.out.println("How many times that you want to input?");
        int times= input.nextInt();
        for (int i=1;i<=times;i++){
            System.out.print("Enter number "+i+": ");
            int n= input.nextInt();
            sum+=n;
        }
        System.out.println("result: "+sum);


    }
}
