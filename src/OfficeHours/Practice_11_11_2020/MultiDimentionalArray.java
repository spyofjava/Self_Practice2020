package OfficeHours.Practice_11_11_2020;

import java.util.Arrays;

public class MultiDimentionalArray {
    public static void main(String[] args) {

        int[] arr1D = { 1, 2, 3, 4  };
        //              0   1  2 3


        //                   0 1 2 3     0 1 2     0 1
        int[][] arr2D =  {  {1,2,3,4} , {5,6,7} , {8,9}     };
        //                      0           1        2
        // {8,9}


        System.out.println(arr2D[1][2]);
        System.out.println(Arrays.toString(arr2D));
        System.out.println(Arrays.deepToString(arr2D));




    }
}
