package Ibrahim;

import java.util.Scanner;

public class CountOfJavaPythonWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String java="java";
        String python="python";
        int countjava=0;
        int countpython=0;
        while(sentence.contains("java")){
            countjava++;
            sentence=sentence.replaceFirst("java","");
        }

        while (sentence.contains("python")){
            countpython++;
            sentence=sentence.replaceFirst("python","");
        }


        if (countjava==countpython){
            System.out.println(countjava==countpython);
        }else {
            System.out.println(countjava==countpython);
        }


    }
}
