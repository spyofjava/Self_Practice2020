package BASIC_EGSERCISES;

import java.util.ArrayList;
import java.util.Arrays;

public class Count_Duplicated_Letters {


    public static void main(String[] args) throws InterruptedException {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('A', 'A', 'A', 'B', 'B', 'C', 'C', 'C', 'C', 'C', 'D', 'D', 'D', 'D', 'D', 'D'));


        ArrayList<Character> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!list1.contains(list.get(i))) {
                list1.add(list.get(i));
            }
        }


        for (int i = 0; i < list1.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list1.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            System.out.print(list1.get(i));
            System.out.print(count);
        }
    }
}