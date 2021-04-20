package Statics;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Static_exercises_1 {

    public static String name = "Ibrahim";
    public int age = 37;
    public static LocalDate timeline = LocalDate.now();

    public static double PI = Math.PI;
    public static String last_name = "Uludag";
    public static int number = 13;




    public static void static_method(){
        System.out.println("static method");
    }



    public static void main(String[] args) {


        Static_exercises_1 static1 = new Static_exercises_1();

        System.out.println(Static_exercises_1.name);
        System.out.println(Static_exercises_1.timeline);
        System.out.println(static1.age);
        Static_exercises_1.static_method();
        System.out.println(Static_exercises_1.PI);
        System.out.println(Static_exercises_1.last_name);
        System.out.println(Static_exercises_1.number);


        System.out.println(timeline.getDayOfMonth());
        System.out.println(timeline.getDayOfYear());
        System.out.println(timeline.getEra());
        System.out.println(timeline.lengthOfMonth());


    }
}
