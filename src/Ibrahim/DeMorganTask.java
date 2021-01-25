package Ibrahim;

public class DeMorganTask {
/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false

 */
    public static boolean loneTeen(int a, int b) {

        boolean result1 = (a >= 13 && a <= 19) ;
        boolean result2 = (b >= 13 && b <= 19);
        if ((result1 && !result2)||(!result1 && result2)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(loneTeen(13,13));
    }
}
