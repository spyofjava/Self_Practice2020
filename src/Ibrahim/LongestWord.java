package Ibrahim;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        int l1=word1.length();
        int l2=word2.length();

        String result=(l1>l2)? word1:word2;
        System.out.println(result);



    }
}
