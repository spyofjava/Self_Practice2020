package July_Exercises;

import java.awt.*;
import java.util.Collection;

public class Palindrome {
    public static void main(String[] args) {
        String str = "boby";
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        if (result.equals(str)){
            System.out.print(Color.getColor(str).getRed());
            System.out.println("   is a Palindrome...");
        }else {
            System.out.print(str);
            System.out.print("   not a Palindrome...");
        }


    }
}
