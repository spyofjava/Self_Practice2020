package Arrays;

import java.util.Arrays;

public class CombineTwoArrays {


    public static String [] Combine2Arrays( String[] arr1,String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length];
        int j = 0;

        for (String each : arr1) {
            arr3[j++] = each;
        }

        for (String each : arr2) {
            arr3[j++] = each;
        }


        return arr3;
    }


}
