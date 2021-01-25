package ReplitTasks;

import java.util.Scanner;

public class LongestWordInArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        String longword=str[0];
        for (int i=0;i< str.length;i++){
            for (int j=0;j< str.length;j++){
                if (longword.length()<str[j].length()){
                    longword=str[j];
                }
            }
        }
        System.out.println(longword);




    }
}
