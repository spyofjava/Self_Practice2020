package ReplitTasks;
import java.util.*;
import java.util.ArrayList;

public class Replit_215 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,5,3,7));

        System.out.println(twoTimes(arr));
    }

    //create your method below:
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list) {

        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int temp : list) {

            newList.add(temp);
            newList.add(temp);

        }

        return newList;

    }
}
