package ReplitTasks;

import java.util.Scanner;

public class Replit_163 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = {scan.nextLine(), scan.next(), scan.next(), scan.next(), scan.next()};
        String t = scan.next();
        count_appearance(arr, t);
    }

    public static void count_appearance(String[] arr, String t) {

        int r = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (t.equalsIgnoreCase(arr[i])) {
                count++;
                r = count;
            }
        }

        System.out.println(r + " because some_array has " + r + " appearances of \"" + t + "\"" + " string.");
    }

}
