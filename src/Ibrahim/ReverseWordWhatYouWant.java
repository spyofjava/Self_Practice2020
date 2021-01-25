package Ibrahim;

import java.util.Scanner;

public class ReverseWordWhatYouWant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int length = word.length();


        for (int i = length - 1; i >= 0; i--) {
            char r = word.charAt(i);
            System.out.print(r);
        }
    }
}
