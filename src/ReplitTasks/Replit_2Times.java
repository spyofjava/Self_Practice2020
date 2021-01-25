package ReplitTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_2Times {

    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        System.out.println(twoTimes(nums));

    }

    public static  ArrayList<Integer> twoTimes(ArrayList<Integer> nums){
        ArrayList<Integer> result=new ArrayList<>();

        for (int each:nums){
            result.add(each);
            result.add(each);
        }

        return result;
    }

}
