package BASIC_EGSERCISES;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Check_equalNumbers {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers will you give ?");
        int howmany = scan.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < howmany; i++) {
            numbers.add(scan.nextInt());
        }

        int count = 1;

        ArrayList<Integer> list2 =new ArrayList<>();
        list2.add(numbers.get(0));

        for (int i = 1; i < numbers.size(); i++) {

            if (list2.contains(numbers.get(i))){
                count++;
            }
        }
        System.out.println("count = " + count);
        if (count == numbers.size()){
            System.out.println("All of them equals");
        }else {
            System.out.println("not equals");
        }

    }


}


