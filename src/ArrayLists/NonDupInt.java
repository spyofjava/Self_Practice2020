package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class NonDupInt {
    public static void main(String[] args) {

        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(2, 3, 1, 3, 2, 2, 4, 5, 21, 7, 34, 8, 3, 3, 7, 6, 9, 6));
        ArrayList<Integer> y = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {

            if (!y.contains(x.get(i))){
                y.add(x.get(i));
            }
        }

        System.out.println(y);



    }
}
