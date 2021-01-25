package ReplitTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_182 {


    public static void main(String[] args) {
        String text="one two three";
        String badWord= "two";

        System.out.println(clean(text, badWord));


    }


    public static String clean(String text,String badWord) {

        if (text.contains(badWord)){
            text=text.replaceAll(badWord, "");
        }
        return text;




    }




    /*
    public static void main(String[] args) {
        String text="one two three";
        String badWord= "two";

        System.out.println(clean(text, badWord));


    }
    public static String clean(String text,String badWord){
        ArrayList<String> text1=new ArrayList<>(Arrays.asList(text.split(" ")));
        System.out.println(text1);

        text1.removeIf(p->p.equals(badWord));
        return (text1.toString().replace("[", "").replace(","," ").replace("]"," "));


    }


     */




}
