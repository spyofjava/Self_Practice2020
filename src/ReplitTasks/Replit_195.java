package ReplitTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_195 {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(sum(list));
    }
    public static int sum(ArrayList<Integer> ints)
    {
        //write code here
        int total=0;
        for (int each:ints){
            total+=each;
        }


        return total;
    }

}
