package Ibrahim;

import java.util.Scanner;

public class XwordX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String first1=word.substring(0,1);
        String last1=word.substring(word.length()-1);



        if (last1.equalsIgnoreCase("x")){
            if (!first1.equalsIgnoreCase("x")){
                String result=word.substring(0,word.length()-1);
                System.out.println(result);
            }else {
                String result=word.substring(1,word.length()-1);
                System.out.println(result);
            }
        }

        else if (first1.equalsIgnoreCase("x")){
            if (last1.equalsIgnoreCase("x")) {
                String result = word.substring(1, word.length() - 1);
            }else {
                String result=word.substring(1,word.length());
                System.out.println(result);
            }

        }else {
            System.out.println(word);
        }






    }
}
