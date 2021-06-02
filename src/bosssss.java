import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class bosssss {

    public static void main(String[] args) {

        int [ ] list1 = {1,2,3,4,5};
        int [ ] list2 = {3,4,5,6,7};

        int[] cl = new int[list1.length+ list2.length];
        for (int i = list1.length; i < list1.length+ list2.length; i++) {
           cl[i] = list2[i];
       }


        System.out.println(Arrays.toString(cl));

    }

}
