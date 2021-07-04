package Empty;

import java.util.Scanner;

public class Strobogrammatic {

    public static void main(String[] args) {

        Scanner scan  =new Scanner(System.in);
        String number = scan.next();//1890

       if (number.contains("1") || number.contains("0") || number.contains("8")) {
           String result = "";
           for (int k = number.length()-1; k >= 0; k--) {
               result += number.charAt(k);
           }
           if (number.equals(result)) {
               System.out.println(number + " is a Strobogrammatic number");
           }else {
               System.err.println(number + " is not a Strobogrammatic number");
           }
       } else if (number.contains("1") || number.contains("0") || number.contains("8")|| number.contains("6")|| number.contains("9")) {//  60



       }






        int i = 0;
        int j = number.length()-1;
        //boolean n1 =  number.charAt(i) == 6 || number.charAt(j) == 9;

        while (i < number.length() & j >= 0 ){


         i++;
         j--;
        }
        //69,11,88,00

    }
}
