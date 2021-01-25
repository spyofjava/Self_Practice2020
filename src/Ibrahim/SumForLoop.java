package Ibrahim;

import java.util.Scanner;

public class SumForLoop {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        int sum=0;

        for (int i=0;i>-1;){
            System.out.println("Enter a number: ");
            int num= input.nextInt();

            if (num<0){
                break;
            }else {
                sum+=num;
                System.out.println("result: "+sum);
            }

        }


    }
}
