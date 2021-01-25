package Methods;

import java.util.Arrays;

public class AddElementInArray {
    public static void main(String[] args) {

        int[] arr = {5,10, 20, 30, 40};

        Addelement(arr, 50);

    }


    public static void Addelement(int[] arr, int num) {

        int[] arr2 = new int[arr.length + 1];

        for (int i = 0; i < arr.length  ; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr2.length - 1] = num;

        System.out.println(Arrays.toString(arr2));

    }


}

