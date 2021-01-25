package ReplitTasks;

import javax.sound.sampled.FloatControl;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Replit_157 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        timeConversion(scan.nextLine());

    }


    public static void timeConversion(String s) {

        String[] hours = s.split(":");

        if (hours[2].substring(2).equalsIgnoreCase("AM")){
            s=s.replaceFirst("AM","");
            System.out.println(s);

        }else if (hours[2].substring(2).equalsIgnoreCase("PM")){
            int h2=Integer.parseInt(s.substring(0,s.indexOf(":")));

            int h=h2+12;
            if (h2>=10){
                if (h<24){
                    s=s.replaceFirst(s.substring(0,2),"");
                    s=s.replaceFirst("PM","");
                    System.out.println(h+s);
                }else {
                    h=0;
                    s=s.replaceFirst(s.substring(0,2),"");
                    s=s.replaceFirst("PM","");
                    System.out.println("00"+s);
                }
            }else {
                if (s.startsWith("0")){
                    s = s.replaceFirst(s.substring(0, 2), "");
                    s = s.replaceFirst("PM", "");
                    System.out.println(h + s);
                }else {
                    s = s.replaceFirst(s.substring(0, 1), "");
                    s = s.replaceFirst("PM", "");
                    System.out.println(h + s);
                }
            }
        }
    }
}
