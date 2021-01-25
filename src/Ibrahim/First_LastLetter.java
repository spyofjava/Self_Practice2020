package Ibrahim;

import java.util.Scanner;

public class First_LastLetter {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String a= input.next();

        String first_last=a.substring(0,1)+a.substring(a.length()-1,a.length());
        System.out.println(first_last);


    }
}
