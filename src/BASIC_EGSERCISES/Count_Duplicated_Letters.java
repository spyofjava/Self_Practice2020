package BASIC_EGSERCISES;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Count_Duplicated_Letters {


    public static void main(String[] args) throws InterruptedException {


        Scanner scan  = new Scanner(System.in);
        //ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "A", "A", "B", "B", "C", "C", "C", "C", "C", "D", "D", "D", "D", "D", "D"));


        System.out.println("How many Character would you like to input? ");
        int howmany= scan.nextInt();
        ArrayList<String  > list = new ArrayList<>();

        for (int i = 1; i <= howmany; i++) {
            list.add(scan.next());
        }



        ArrayList<String> list1 = new ArrayList<>();

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





/*
            //=====>     GOOD METHOD   ===========


    String word = "AAAABBBCCCCDDDEFGGG";
    String result = "";
    ArrayList<String > list = new ArrayList<>(Arrays.asList(word.split("")));

        for (String each : list) {
        int frequency = Collections.frequency(list, each);
        if (result.contains(each)){
            continue;
        }

        result+= each+frequency;

    }
        System.out.println(result);




 */





}
