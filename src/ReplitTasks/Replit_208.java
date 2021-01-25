package ReplitTasks;

import java.util.Arrays;

public class Replit_208 {
    public static int[] populate(int[] r){
        //write your codes here
        for (int i=0;i<r.length;i++){
            r[i]=i+1;
        }
        return r;

    }

    public static void main(String[] args){

        int [] i= new int[4];
        i= populate(i) ;
        System.out.println(Arrays.toString(i));

    }
}
