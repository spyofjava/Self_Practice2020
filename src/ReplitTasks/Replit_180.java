package ReplitTasks;

import java.util.Arrays;

public class Replit_180 {
    public static void main(String[] args) {
        System.out.println(coverString("hello hello", "ello")); //java [me]thods
    }

    public static String coverString(String main, String coverME) {
        String a = "";
        if (main.contains(coverME)) {
            String[] arr = main.split(coverME);
            System.out.println(Arrays.toString(arr));

            for (int i = 0; i < arr.length; i++) {
                if (i < arr.length - 1) {
                    a += arr[i] + "[" + coverME + "]";
                } else {
                    if (main.endsWith(coverME)) {
                        a += arr[i] + "[" + coverME + "]";
                    } else {
                        a += arr[i];
                    }
                }
            }
        } else {
            a = ("[" + main + "]");
        }
        return a;
    }
}
