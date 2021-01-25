package ReplitTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_190 {

    public static int[] mergR(int[] a,int[] b) {
        ArrayList<Integer> merge = new ArrayList<>();
        for (int each:a){
            merge.add(each);
        }
        for (int each:b){
            merge.add(each);
        }
        int[] arr=new int[a.length+b.length];
        for (int i=0;i<a.length+b.length;i++) {
            arr[i]+= merge.get(i);
        }
        return arr;
    }//end mergR
    public static void main(String[] args){

        int[] a ={1,2,3};
        int[] b ={4,5};

        System.out.println(Arrays.toString(mergR(a,b)));

    }
}
