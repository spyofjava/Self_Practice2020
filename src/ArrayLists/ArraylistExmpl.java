package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistExmpl {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> list = new ArrayList<>();



        list.add("@");
        list.add(".");
        list.add(".");
        list.add(".");
        list.add(".");
        list.add(".");
        list.add(".");
        list.add(".");
        list.add(".");
      //  System.out.println(list);
     //   Collections.sort(list);
     //   System.out.println(list);
      //  Collections.swap(list,3,0);
      //  System.out.println(list);


      // for (int i = 0; i < 8; i++) {
        int i=0;
        while (true){
            if (i<8) {
                System.out.print("\r" + list);

                Collections.swap(list, i, i + 1);

                i++;
            }else {
                i = 0;
            }
            Thread.sleep(300);
        }

    }
}
