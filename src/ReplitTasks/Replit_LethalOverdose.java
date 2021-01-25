package ReplitTasks;

import java.util.Scanner;

public class Replit_LethalOverdose {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int numberofmg= input.nextInt();


        int overdosemg=10000;
        int howmanycup=overdosemg/numberofmg;
        System.out.println("It would take about "+howmanycup+" drinks for a lethal overdose.");

    }
}
