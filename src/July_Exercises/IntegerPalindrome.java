package July_Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class IntegerPalindrome {
    public static int num = 379;
    public static int num1 = num;

    public static void main(String[] args) {

        int result = 0;
        int lastDigit = 0;

        for (int i = 0; i < 3; i++) {
            result += digitValue(num % 10);
            num /= 10;
        }


        IsPalindrome(result);

    }

    public static int digitValue(int digit) {
        boolean v1 = (num >= 1 && num < 10);
        boolean v2 = (num > 9 && num < 100);
        boolean v3 = (num > 99 && num < 1000);
        boolean v4 = (num > 999 && num < 10000);
        if (v4) {
            return digit * 1000;
        } else if (v3) {
            return digit * 100;
        } else if (v2) {
            return digit * 10;
        } else {
            return digit;
        }

    }
    public static void IsPalindrome(int result){
        if (result == num1){
            System.out.println("YES "+ num1 + " is an integer palindrome");
        }else {
            System.out.println("NO "+ num1 + " is not an integer palindrome");
        }
    }
}
