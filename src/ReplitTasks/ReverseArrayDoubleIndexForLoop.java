package ReplitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayDoubleIndexForLoop {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int[] reversed = new int[nums.length];
        for (int i = nums.length - 1, j=0; i >= 0;j++, i--) {
            reversed[j] = nums[i];
        }

        System.out.print(Arrays.toString(reversed));


    }
}
