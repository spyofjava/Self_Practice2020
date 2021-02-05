package Collections;

import sun.plugin.javascript.navig4.Link;

import java.util.*;

public class SetType {

    public static void main(String[] args) {

        Collection<Integer> numbers = new ArrayList<>(); //===>we did apply polymorphism in here
        System.out.println(numbers.size());

        numbers.add(100);

        System.out.println(numbers.size());

        numbers.addAll(Arrays.asList(11,12,13,14,15,16,17,18,19,20));

        System.out.println("numbers = " + numbers);
        System.out.println(numbers.size());

        System.out.println(numbers.contains(5));// there is no index we can not coll specific index

        System.out.println(((List)numbers).get(5));// to use get() method  we must down casting to the List. Becaouse List has get method
        System.out.println(((ArrayList)numbers).get(5));// to use get() method  we must down casting to the ArrayList. Because Array list has get method
        System.out.println(((LinkedList)numbers).get(5));// to use get() method  we must down casting to the ArrayList. Because Array list has get method


        Collection<String> names = new LinkedHashSet<>();

        Collection<Integer> scores = new LinkedList<>();

        List<Integer> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list1.removeIf(p->p<5);
        System.out.println(list1);

        List<Integer> list2= new LinkedList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));// faster
        list2.removeIf(p->p<5);
        System.out.println(list2);

        List<Integer> list3= new Vector<>();
        List<Integer> list4=new Stack<>();
        Vector<Integer> list5=new Stack<>();











    }

}
