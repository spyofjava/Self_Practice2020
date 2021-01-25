package Ibrahim;

import java.util.Arrays;

public class ArrayDescending {
    public static void main(String[] args) {

        int[] arr={5,1,2,6,7,0};

        Arrays.sort(arr);
        System.out.print("[");
        for (int i=arr.length-1;i>=0 ;i--) {

            if (i>0) {
                System.out.print(arr[i]+", ");
            }
            else {
                System.out.print(arr[i]);;
            }

        }
        System.out.print("]");


    }
}
