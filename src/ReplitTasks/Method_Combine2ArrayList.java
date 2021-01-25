package ReplitTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Method_Combine2ArrayList {


    public static void main(String[] args) {

        ArrayList<String > wordList1=new ArrayList<>(Arrays.asList("a", "b"));
        ArrayList<String > wordList2=new ArrayList<>(Arrays.asList("c","d"));


        System.out.println(combineAL(wordList1,wordList2));
    }
    public static ArrayList<String> combineAL(ArrayList<String > list1,ArrayList<String > list2){

        ArrayList<String > str=new ArrayList<>();
        str.addAll(list1);
        str.addAll(list2);
        return str;

    }


}
