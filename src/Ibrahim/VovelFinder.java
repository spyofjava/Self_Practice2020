package Ibrahim;

import java.util.Scanner;

public class VovelFinder {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        for (int i=0;i< word.length();i++){
            char a=word.charAt(i);


            if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                System.out.print(a);
            }
        }


    }
}
