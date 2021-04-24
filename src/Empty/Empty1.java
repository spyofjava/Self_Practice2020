package Empty;

import java.util.*;

public class Empty1 {


    public static void main(String[] args) throws NullPointerException {


        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= number; i++) {

            for (int j = 0; j < number; j++) {

                if (i + j == number) {
                    list.add(i*j);
                }
            }
        }
        System.out.println(Collections.max(list));


    }
}
