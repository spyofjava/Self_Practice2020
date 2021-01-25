package ReplitTasks;

import java.util.Arrays;

public class Replit_207 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(Arrays.toString(do_switch(arr)));
    }

    public static int[] do_switch(int[] i) {

        int first = i[0];
        int last = i[i.length - 1];
        i[0] = last;
        i[i.length - 1] = first;


        return i;
    }
}
