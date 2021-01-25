package ReplitTasks;

import java.util.Scanner;

public class Replit_150 {

    public static void printHollowRect(int a) {
        // write your codes here


        for (int i = 0; i < a; i++) {

            for (int j = 0; j < a; j++) {
                if (i == 0 || i == a - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == a - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        printHollowRect(input.nextInt());
    }



}
