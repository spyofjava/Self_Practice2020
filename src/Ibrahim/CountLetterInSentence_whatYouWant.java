package Ibrahim;

import java.util.Scanner;

public class CountLetterInSentence_whatYouWant {
    public static void main(String[] args) {

//  #########################  count   'i' letter     #######################
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Sentence:");
        String a=input.nextLine();

        int k=0;
        for (int i=0;i<a.length();i++) {
            char g=a.charAt(i);
            char l='a';
            if (g==l) {
                k++;
            }
        }
        System.out.println(k);



    }
}
