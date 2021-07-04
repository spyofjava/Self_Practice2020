import java.util.Scanner;

public class bosssss3 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        String str = scan.nextLine();

        Palindome(str);

    }


    public static void Palindome(String str){
        String result = "";
        for (int i = str.length()-1 ; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        if (result.equals(str)){
            System.err.print(str);
            System.out.println(" is a Palindrome");
        }else {
            System.err.print(str);
            System.out.println(" isn't a Palindrome");

        }
    }
}
