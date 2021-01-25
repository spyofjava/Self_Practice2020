package ReplitTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_Methods_with_String_12 {

    public static void main(String[] args) {

        String str1 = "a78sd";
        System.out.println(extractNum(str1));


    }
    public static String extractNum(String s) {

        ArrayList<String > str= new ArrayList<String>(Arrays.asList(s.split("")));
        str.removeIf(p->!Character.isDigit(p.charAt(0)));

        return str.toString().replace("[","").replace(", ","").replace("]","");

    }
}
