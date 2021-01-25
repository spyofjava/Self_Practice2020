package Ibrahim;

public class Nice_1 {
/*
Given a string, return a new string where "not " has been added to the front. However,
if the string already begins with "not", return the string unchanged.
Note: use .equals() to compare 2 strings.
 */

    public static String notString(String str) {
        if (str.contains("not")) {
            if (str.substring(0, 3).equals("not")) {
                return (str);
            }else {
                return ("not "+str);
            }
        }


        else {
            return ("not "+str);
        }

    }

    public static void main(String[] args) {
        notString("x");
        notString("not bad");
        notString("bad");
        notString("is not");
    }
}
