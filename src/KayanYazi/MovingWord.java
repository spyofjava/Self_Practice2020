package KayanYazi;

import java.util.ArrayList;
import java.util.Arrays;

public class MovingWord {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> num=new ArrayList<>(Arrays.asList("s" + "a" + "b" + "i" + "h" + "a", "@", "@", "@", "m" + "u" + "h" + "a" + "m" + "m" + "e" + "t" + "@" + "T" + "a" + "h" + "a", "@", "@", "@", "s" + "a" + "r" + "e", "@", "@", "@", "i" + "b" + "r" + "a" + "h" + "i" + "m", "@", "@"));
        //ArrayList<String> num=new ArrayList<>(Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"));
        // Collections.swap(num,0,7);
        System.out.println("num = " + num);
        while (true){


            num.add(0,num.get(num.size()-1));
            num.remove(num.size()-1);
            //num.remove(num.get(num.size()-1));
            // num.add(num.get(0),num.get(num.size()-1));
            // num.remove(num.get(num.size()-1));



            Thread.sleep(100);
            System.out.print("\rnum = " +num);



        }

    }
}
