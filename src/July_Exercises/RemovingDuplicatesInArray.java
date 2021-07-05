package July_Exercises;

import java.util.Arrays;

public class RemovingDuplicatesInArray {
    public static void main(String[] args) {

        String [] arr = {"a","a","n","y","y","e","e","e","k"};
        String [] result = new String[arr.length];

        String word = "";

        for (int i = 0; i < arr.length; i++) {

            if (word.contains(arr[i])){
                continue;
            }else {
                word += arr[i];
            }
        }
        System.out.println(Arrays.asList(word.split("")));



    }
}
