package Collections;

import java.util.*;

public class listType {

    public static void main(String[] args) {



        List<Integer> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list1.removeIf(p->p<5);
        System.out.println("list1 = " + list1);

        List<Integer> list2= new LinkedList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));// faster
        list2.removeIf(p->p<5);
        System.out.println("list2 = " + list2);

        List<Integer> list3= new Vector<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3.removeIf(p->p<5);
        System.out.println("list3 = " + list3);


        List<Integer> list4=new Stack<>();

        list4.addAll(Arrays.asList(15,25,35,45));
        System.out.println("list4 = " + list4);
        ((Stack<Integer>) list4).pop();
        System.out.println("list4 = " + list4);
        int l2=((Stack<Integer>) list4).pop();
        System.out.println("list4 = " + list4);
        ((Stack<Integer>) list4).pop();
        System.out.println("list4 = " + list4);


        System.out.println("===============================");

        Stack<String > names= new Stack<>();
        names.addAll(Arrays.asList("Aysel","amir","mohammed","bursa","necdet","break"));
        System.out.println(names);
        names.pop();
        System.out.println(names);
        names.pop();
        System.out.println(names);
        names.pop();
        System.out.println(names);
        names.pop();
        System.out.println(names);
        names.pop();
        System.out.println(names);
        names.pop();
        System.out.println(names);
        System.out.println(names.pop());








    }


    public synchronized void method1(){

    }
    public void method2(){


    }

}
