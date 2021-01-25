package ReplitTasks;

import java.util.Scanner;

public class Replit_MixedCase {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

        String result="";
        for (int i = 0 ; i < s.length();i++){
            if (i%2==0){
                result+=s.substring(i,i+1).toLowerCase();
            }else {
                result+=s.substring(i,i+1).toUpperCase();
            }
        }

        System.out.println(result);
    }

}
