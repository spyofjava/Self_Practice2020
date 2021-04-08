package BASIC_EGSERCISES;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Non_Duplicate {


    public static void main(String[] args) {

        NonDup("Anakarabala");


    }


    public static void NonDup(String word){

        ArrayList<String> arr = new ArrayList<>(Arrays.asList(word.toLowerCase().split("")));

        String result = "";
        for (int i = 0; i < arr.size(); i++) {
            if (!result.contains(arr.get(i))){
                result += ""+arr.get(i);
            }
        }

        System.out.println(result);

    }


}


