package Ibrahim;

import java.util.Scanner;

public class Substring_Concate_trim {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("full name:");
        String a= input.nextLine();

        a=a.trim();
        System.out.println(a);

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        System.out.print("username:");
        String y="ibrahim";
        y=y.concat("hocamm@gmail.com");
        System.out.println(y);
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%







    }
}
