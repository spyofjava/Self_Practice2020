package ReplitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_134 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];

        for (int i = 0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for (int j = 0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }

        Arrays.sort(inner);
        Arrays.sort(outer);

        int count = 0;
        for (int i = 0; i < sizeInner; i++) {
            for (int j = 0; j < sizeOuter; j++) {
                if (inner[i] == outer[j]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
        if (count == sizeInner) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
/*
input (inner): 2, 4
input (outer): 1, 2, 4, 6
output: true

input (outer): 1, 2, 4
input (inner): 6, 5
output: false
 */
