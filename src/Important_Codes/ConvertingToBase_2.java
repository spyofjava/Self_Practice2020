package Important_Codes;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertingToBase_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        int quotient;
        int reminder;
        int i=7;

        quotient=decimal/2;//35/2=17
        reminder=decimal%2;//1
        while (quotient>=2){//17,8,4,2
            decimal=quotient;//decimal=17,8,4,2
            binary[i--]=reminder;//[1,0,0,0
            quotient=decimal/2;//quotient=8,4,2,1
            reminder=decimal%2;//reminder=0,0,0,0
        }
        if (quotient==1){
            binary[--i]=quotient;
            binary[++i]=reminder;
        }
        System.out.println(Arrays.toString(binary));

    }

}
