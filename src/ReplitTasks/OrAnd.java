package ReplitTasks;

import java.util.Scanner;

public class OrAnd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String username= scan.nextLine();
        boolean a=username.equals("Max Payne")||username.equals("Max payne");
        boolean b=username.equals("Alan Wake")||username.equals("alan wake");

        if(a||b){
            System.out.println("User found!");
        }else {
            System.out.println("User not found!");
        }

    }
}
