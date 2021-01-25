package ReplitTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_Methods_appendPosSum {

    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(-3,5,-8,0,-7,4,-2,5));

        System.out.println(appendPosSum(nums));

    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){


        ArrayList<Integer> list = new ArrayList<>(nums);
        list.removeIf(p->p<=0);
        int sum=0;
        for (int each:list){
            sum+=each;
        }
        list.add(sum);
        return list;


    }

}
