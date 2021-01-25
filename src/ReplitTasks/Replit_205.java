package ReplitTasks;

import java.util.Arrays;

public class Replit_205 {
    public static void main(String[] args) {

        int[] nums1 = {10, 40, 50, 3, 1};
        int[] nums2 = {11, 0, 500, 44, 1101};
        System.out.println(Arrays.toString(addElements(nums1, nums2)));
    }


    public static int[] addElements(int[] ints1, int[] ints2) {

        int[] arr = new int[ints1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ints1[i] + ints2[i];
        }
        return arr;

    }
}
