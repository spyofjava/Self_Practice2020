package ReplitTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplitAssessment_2 {

    public static void main(String[] args) {
        String target="laptop";
        String sentence="I would like to buy a new laptop because my laptop is too old.";

        System.out.println(appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old."));
    }

    /**
     *target - string that you need to check.
     * sentence - string where you need to lookup for target.
     *
     */
    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:
        ArrayList<String > list=new ArrayList<>(Arrays.asList(sentence.split(" ")));

        int count=0;

        for ( int i=0 ;i<list.size();i++){
            if (list.get(i).equals(target+",")||list.get(i).equals(target)){
                count++;

            }
        }

        if(count==2){
            return (true);
        }else {
            return (false);
        }

    }
}
