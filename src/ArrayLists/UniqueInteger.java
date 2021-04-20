package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueInteger {

    public static void main(String[] args) {

        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(1,5,6,6,7,8,6,3,2,9,0,8,7,3,2,9,0));

        int count = 0;
        ArrayList<Integer> countlist = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            count = 0;
            for (int j = 0; j < x.size(); j++) {
                if (x.get(i) == x.get(j)) {
                    count++;
                }
            }
            if (count == 1) {
                countlist.add(x.get(i));
            }
        }

        if (countlist.size() > 1) {
            System.out.println(countlist + " are uniques");
        }

        if (countlist.size() == 1) {
            System.out.println(countlist + " is unique");
        }




    }
}
