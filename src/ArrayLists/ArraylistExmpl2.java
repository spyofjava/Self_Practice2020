package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistExmpl2 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,12,3,14,65,2,76,23,6,25,43,16,13));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        list.add(444);
        System.out.println(list);
        list.remove(6);
        list.removeAll(Arrays.asList(16,23));
        System.out.println(list);
        list.remove(10);
        System.out.println(list);
        list.removeIf(p->p>34);
        System.out.println(list);
        System.out.println(list.contains(60));
        System.out.println(list.contains(6));


    }
}
