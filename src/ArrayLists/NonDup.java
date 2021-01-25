package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class NonDup {


    public static void nonDup(){
        Scanner input=new Scanner(System.in);
        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('C');
        characters.add('C');
        characters.add('C');
        characters.add('C');
        characters.add('C');


        ArrayList<Character> newList=new ArrayList<>();
        newList.add(characters.get(0));

        for (char each:characters){
            if (!newList.contains(each)){
                newList.add(each);
            }
        }
        System.out.println(newList);
        return;
    }





}
