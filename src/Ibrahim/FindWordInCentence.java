package Ibrahim;

import java.util.Scanner;

public class FindWordInCentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine().toLowerCase();
        System.out.print("Which word are you looking for?");
        String word = scan.nextLine().toLowerCase();

        int count =0;
        while (sentence.contains(word)){
            sentence=sentence.replaceFirst(word,"");
            count++;
        }
        System.out.println(word+" had been used "+count+" times");





    }
}
