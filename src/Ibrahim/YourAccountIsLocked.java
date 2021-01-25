package Ibrahim;

import java.util.Scanner;

public class YourAccountIsLocked {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("username: ");
        String username= input.nextLine();
        System.out.println("password: ");
        String password= input.nextLine();

        String user="asd";
        String passw="123qwe";
        if (username==user && password==passw){
            System.out.println("you are logged in...");
        }else {

            for (int i = 1; i <= 3; i++) {
                if (i == 3) {
                    System.out.println("Your account is locked");
                } else {
                    System.out.println("Please er enter:");
                    System.out.println("username: ");
                    username = input.nextLine();
                    System.out.println("password: ");
                    password = input.nextLine();
                }

            }

        }




    }
}
