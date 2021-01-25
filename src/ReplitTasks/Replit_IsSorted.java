package ReplitTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Replit_IsSorted {

    public static void main(String[] args) {
        int[] arr = {2,3,5,4,9};

        System.out.println(isSort(arr));

    }
    public static boolean isSort(int[] nums) {
        ArrayList<Integer> nums1=new ArrayList<>();
        ArrayList<Integer> temp1=new ArrayList<>();
        for (int each:nums){
            nums1.add(each);
            temp1.add(each);
        }
        Collections.sort(temp1);
        System.out.println(temp1);
        System.out.println(nums1);
        return nums1.equals(temp1);

    }
}
