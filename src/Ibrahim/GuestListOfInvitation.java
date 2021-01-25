package Ibrahim;

import java.util.Scanner;

public class GuestListOfInvitation {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String name= input.nextLine();
        String namelist=name;
        System.out.println("Do you want to enter new guest name:");
        String question= input.nextLine().toLowerCase();
        String newname="";

        while (question.equalsIgnoreCase("yes")){
            System.out.println("Please enter guest name:");
            newname+=", "+input.nextLine();

            System.out.println("Do you want to enter new guest name:");
            question= input.nextLine().toLowerCase();

        }

        System.out.println("Guest's list: "+name+newname);


    }
}
/*
Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda
*/