package ReplitTasks;

import java.util.Scanner;

public class Replit_138 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        String[] arr=str.split(" ");//[java, is, fun]
        String[] reverse=new String[arr.length];
        for (int i=arr.length-1,j=0 ; i>=0 ; j++,i--){
            reverse[j]=arr[i];//[fun, is, java]
        }
        for (int i = 0; i < reverse.length; i++) {
            if (i < reverse.length - 1) {
                System.out.print(reverse[i] + " ");
            } else {
                System.out.print(reverse[i]);
            }
        }


        /*
        Given a String variable sentence, write code to get
        each word and assign to String reversed in reverse order.
Example:
sentence -> "Java is fun"
reversed -> "fun is Java"
         */




    }


}




