package ReplitTasks;

import java.util.Scanner;

public class Replit_PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for (int i = 0 ; i<word.length(); i++){
            boolean a=word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u';
            if (a){
                System.out.print(word.charAt(i));
            }
        }

    }
}
