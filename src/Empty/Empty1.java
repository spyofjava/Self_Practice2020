package Empty;

import java.util.*;

public class Empty1 {



    public static void main(String[] args )  throws NullPointerException{


        String a = new String("abc");
        String b = new String("abc");

        System.out.println(a==b); //two different object means two different place "==" checks whether the places are same in the memory
        System.out.println(a.equals(b));// ".equals()" method checks whether contents are same.

        int[] arr = new int[]{1,2};
        int[] arrr = {1,2};
        System.out.println("=====================");

        System.out.println(Arrays.equals(arrr,arr));
        System.out.println(arr==arrr);
        System.out.println();


        float[] f = new float[1];





    }
}
