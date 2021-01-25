package ReplitTasks;

import java.util.Scanner;

public class SplitStringArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        String[] n=sentence.split(" ");
        int i=0;
        while (i>=0 && i<n.length) {
            System.out.println(n[i++]);
        }


    }
}
