package Ibrahim;

import java.util.Scanner;

public class CountWordOfCatDog {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        System.out.println("Enter a sentence:");
        String word = scan.nextLine();

        String word2=word;
        String word3=word;

        if (word.contains("cat")||word.contains("dog")) {

            while(word2.contains("cat")) {
                countOfCats++;
                word2 = word2.replaceFirst("cat", "");

            }


            while(word3.contains("dog")) {
                countOfDogs++;
                word3 = word3.replaceFirst("dog", "");

            }


        }
        if (countOfCats==countOfDogs){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
