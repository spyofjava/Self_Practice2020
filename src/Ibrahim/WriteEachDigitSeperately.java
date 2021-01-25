package Ibrahim;

import java.util.Arrays;
import java.util.Scanner;

public class WriteEachDigitSeperately {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= input.nextInt();
        //12345
        int[] eachdigit=new int[5];
        int remainder=1;
        for (int i=0;i<=4;i++){
            remainder=number%10;//  12345-->5         1234-->4       123-->3      12-->2       1-->1
            number/=10;//1234
            eachdigit[i]+=remainder;
        }

        Arrays.sort(eachdigit);
        for (int i=0;i<eachdigit.length;i++) {
            System.out.println("digit"+(i+1)+": "+eachdigit[i]);
        }


    }
}
