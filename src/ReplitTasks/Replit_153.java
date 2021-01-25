package ReplitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_153 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        person(s);
    }

    public static void person(String info) {
        String []arr=info.split(",");
        String name = arr[0];
        String lastName = arr[1];
        String age = arr[2];
        System.out.println("person name: "+name+" last name: "+lastName+" age: "+age);


    }
}
