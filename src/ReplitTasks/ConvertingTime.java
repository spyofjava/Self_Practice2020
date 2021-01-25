package ReplitTasks;

import java.util.Scanner;

public class ConvertingTime {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter seconds:");
        int secondinput= input.nextInt();


        int minutes=(secondinput/60)%60;
        int hours=(secondinput/60)/60;
        int second=secondinput%60;
        String result=hours+" hours, "+minutes+" minutes, and "+second+" seconds";
        System.out.println(result);






    }
}
