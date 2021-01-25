package ReplitTasks;

import java.util.Arrays;

public class Replit_Assessment_3 {

    public static void main(String[] args) {
        System.out.println(Arrays.asList(reverse(new String[]{"apple", "pear"})));
    }

    public static String[] reverse(String[] arr) {
        String [] list=new String[arr.length];
        for (int j=arr.length-1,i=0; j>=0 ;i++,j--) {
            list[i]=arr[j];
        }
        return list;

    }
}
