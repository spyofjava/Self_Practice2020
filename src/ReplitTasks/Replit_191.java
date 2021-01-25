package ReplitTasks;

import java.util.Arrays;

public class Replit_191 {

    public static void main(String[] args) {

        String str = "abcdef";
        System.out.println(reverse(str));

    }

    public static String reverse(String input) {

        String[] list=new String[input.split("").length];
        list=input.split("");
        System.out.println(Arrays.toString(list));
        String [] reverse=new String[list.length];
        for (int i = input.length() - 1,j=0; i >= 0;j++, i--) {
            reverse[j] = list[i];
        }


        return  Arrays.toString(reverse).replace("[","").replace(", ","").replace("]","");
    }
}
