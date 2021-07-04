import java.util.Arrays;
import java.util.Scanner;

public class bosssss2 {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String str2 = "";

    for (int i = 0; i < str.length(); i++) {
            if (!str2.contains(" ")) {
                str2 += str.charAt(i);
            }else {
                if (str.charAt(i) != ' '){
                    str2 += str.charAt(i);
                }
            }
        }
        System.out.println(str2);
    }

}
