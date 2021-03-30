package BASIC_EGSERCISES;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckBetween_0_To_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers will you input? ");
        int countOfNum = scan.nextInt();

        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < countOfNum; i++) {
            double num = scan.nextDouble();
            if (num > 0 && num < 1){
                list.add(num);
            }
        }

        if (list.size()==countOfNum){
            System.out.println(true);
        }else {
            System.out.println(false+" NO! All of them are not between 0 and 1 ");
        }


    }
}
