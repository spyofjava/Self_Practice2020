package BASIC_EGSERCISES;

import java.util.ArrayList;
import java.util.Arrays;

public class Frequency_Of_Character {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(("AAAABBBCCDDDDD").split("")));

        for (int i = 0; i < list.size(); i++) {
            String choosedLetter=list.get(i);
            int count=0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(choosedLetter)){
                    count++;
                }
            }

            System.out.print(list.get(i)+count);
        }



    }


}
