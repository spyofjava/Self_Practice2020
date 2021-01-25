package ReplitTasks;

import java.util.Scanner;

public class Replit_ConditionalStatement {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below

        if (word.charAt(word.length()-1)=='y'){
            if (word.substring(word.length()-2).equals("ey")){
                System.out.println(word.replace(word.substring(word.length()-2),"eys" ));
            }else {
                System.out.println(word.replace("" + word.charAt(word.length() - 1), "ies"));
            }
        }else  if (word.substring(word.length()-3).equals("ife")){
            System.out.println(word.replace(word.substring(word.length()-3),"ives" ));
        }else {
            System.out.println(word.replace(word.substring(word.length()-1),"s" ));
        }



    }
}
/*
If the word ends in "y", print "-ies"
If the word ends in "ey", print "-eys"
If the word ends in "ife", print "-ives"
If none of the above is true, print "-s"
No more than one should be printed.
 */
