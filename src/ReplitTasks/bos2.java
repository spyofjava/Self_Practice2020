package ReplitTasks;

import ReplitTasks.OOP8_BookShelf.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class bos2 {

    public static void main(String[] args) {




        //  fix34([1, 3, 1, 4, 4, 3, 1])-----"1314431" ----→ [1, 3, 4, 1, 1, 3, 4]
        //fix34([1, 3, 1, 4]) ----------------->"1314"-----→ [1, 3, 4, 1]
        //fix34([3, 2, 2, 4]) ----------------->"3224"-----→ [3, 4, 2, 2]
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(1, 3, 1, 4, 4, 3, 1));

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)==3){
                for (int j = 0; j < arr.size(); j++) {
                    if (arr.get(j)==4){
                        Collections.swap(arr, i+1,j );
                    }
                }
            }
        }



        System.out.println(arr);


    }

}



