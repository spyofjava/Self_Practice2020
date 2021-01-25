package ReplitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_140 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String[] result=new String[words.length];

        for (int i=0;i< 5;i++){
            // for (int j=0;j<words[i].length();j++){
            result[i]=words[i].substring(0,1)+words[i].substring(words[i].length()-1);
            //  }
        }
        System.out.println(Arrays.toString(result));

    }
}
